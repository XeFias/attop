package nl.utwente.ewi.fmt.UATMM.transformers;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import nl.utwente.ewi.fmt.UATMM.standalone.Language;

import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.eol.IEolExecutableModule; //<---
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException; //<---
import org.eclipse.epsilon.eol.models.IModel; //<---

/**
 * Transform from AT metamodel to CADP AUT xml representation
 * @author Patrick van Berkel
 */
public class AUT2DOT extends EpsilonTransformer {
	/** The singleton instance of this transformer. */
	private static AUT2DOT INSTANCE;
	
	/** Returns the singleton instance of this transformer. */
	public static AUT2DOT instance() {
		if (INSTANCE == null) {
			INSTANCE = new AUT2DOT();
		}
		return INSTANCE;
	}
	
	/** Constructor for the singleton instance of this transformer. */
	private AUT2DOT() {
		super(Arrays.asList(new Language[]{Language.IMA}), Arrays.asList(new Language[]{Language.DOT}));
	}

	@Override
	public IEolExecutableModule createModule() {
		return new EglTemplateFactoryModuleAdapter(new EglTemplateFactory());
	}

	@Override
	public HashSet<IModel> getModels(Map<String, Language> inputs, Map<Language, String> outputs, Language output)
			throws EolModelLoadingException, URISyntaxException, IOException {
		// EGL transformation does not have output model, only generated output
		HashSet<IModel> out = new HashSet<IModel>();
		for (Map.Entry<String, Language> e : inputs.entrySet()) {
			if (e.getValue() == Language.IMA )
				out.add(createEmfModel(e.getValue(), Role.SOURCE, e.getKey()));
		}
		return out;
	}

	@Override
	public Map<Language, String> getTransformations() {
		Map<Language, String> ret = new HashMap<Language, String>();
		ret.put(Language.DOT, "transformations/AUT2DOT.egl");
		return ret;
	}

	@Override
	public Object execute(Map<String, Language> inputs, Map<Language, String> outputs) throws Exception {
		String outputPath = outputs.get(Language.DOT);
		Object result = super.execute(inputs, outputs);
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(outputPath), "utf-8"))) {
			writer.write(result.toString());
		}
		return result;
	}
}
