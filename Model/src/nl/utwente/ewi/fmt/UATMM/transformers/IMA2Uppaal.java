package nl.utwente.ewi.fmt.UATMM.transformers;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

import nl.utwente.ewi.fmt.UATMM.standalone.Language;
import nl.utwente.ewi.fmt.UATMM.transformers.EpsilonTransformer.Role;

import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.etl.EtlModule;

/**
 * Transform from AT metamodel to UPPAAL xml representation (CORA specific).
 * @author Patrick van Berkel
 */
public class IMA2Uppaal extends EpsilonTransformer {
	/** The singleton instance of this transformer. */
	private static IMA2Uppaal INSTANCE;
	public static boolean USE_COST = false; 
	// ATTop currently uses static UAT2Uppaal.USE_CORE as global.
	
	/** Returns the singleton instance of this transformer. */
	public static IMA2Uppaal instance() {
		if (INSTANCE == null) {
			INSTANCE = new IMA2Uppaal();
		}
		return INSTANCE;
	}

	/** Constructor for the singleton instance of this transformer. */
	private IMA2Uppaal() {
		super(Arrays.asList(new Language[]{Language.UATV, Language.IMA}), Arrays.asList(new Language[]{Language.UPPAAL}));
	}
	
	@Override
	public Set<Language> getOptionalSourceLanguages()
	{
		return Collections.singleton(Language.UATM);
	}

	@Override
	public IEolExecutableModule createModule() {
		return new EtlModule();
	}

	@Override
	public HashSet<IModel> getModels(Map<String, Language> inputs, Map<Language, String> outputs, Language output)
			throws EolModelLoadingException, URISyntaxException, IOException
	{
		HashSet<IModel> models = new HashSet<IModel>();
		for (Map.Entry<String, Language> e : inputs.entrySet()) {
			if (e.getValue() == Language.IMA || e.getValue() == Language.UATV)
				models.add(createEmfModel(e.getValue(), Role.SOURCE, e.getKey()));
		}
		if (output != Language.UPPAAL)
			throw new UnsupportedOperationException("IMA2Uppaal cannot produce " + output + " outputs");
		models.add(createEmfModel(Language.UPPAAL, Role.TARGET, outputs.get(Language.UPPAAL)));
		return models;
	}

	@Override
	public Map<Language, String> getTransformations() {
		EnumMap<Language, String> ret = new EnumMap<Language, String>(Language.class);
		String etl = "";
		/* Intentional reusing class UAT2Uppaal i.s.o. IMA2Uppaal to keep one source of truth.*/
		if ( UAT2Uppaal.USE_CORA ) { etl = "IMA2UppaalCORA.etl"; }
		else if (IMA2Uppaal.USE_COST) { etl = "IMA2UppaalWithCost.etl"; }
		else { etl = "IMA2UppaalNoCost.etl"; }
		ret.put( Language.UPPAAL, "transformations/FullModel/" + etl );
		return ret;
	}
}
