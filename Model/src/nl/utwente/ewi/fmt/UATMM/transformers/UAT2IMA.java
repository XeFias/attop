package nl.utwente.ewi.fmt.UATMM.transformers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import nl.utwente.ewi.fmt.UATMM.standalone.Language;
import nl.utwente.ewi.fmt.UATMM.transformers.EpsilonTransformer.Role;

import org.eclipse.epsilon.eol.EolModule;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.eol.IEolExecutableModule; //<---
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException; //<---
import org.eclipse.epsilon.eol.models.IModel; //<---

/**
 * Transform from AT metamodel to CADP AUT xml representation
 * @author Patrick van Berkel
 */
public class UAT2IMA extends EpsilonTransformer {
	/** The singleton instance of this transformer. */
	private static UAT2IMA INSTANCE;
	
	/** Returns the singleton instance of this transformer. */
	public static UAT2IMA instance() {
		if (INSTANCE == null) {
			INSTANCE = new UAT2IMA();
		}
		return INSTANCE;
	}
	
	/** Constructor for the singleton instance of this transformer. */
	private UAT2IMA() {
		super(Arrays.asList(new Language[]{Language.UATS, Language.UATV}), Arrays.asList(new Language[]{Language.IMA}));
	}

	@Override
	public IEolExecutableModule createModule() {
		return new EglTemplateFactoryModuleAdapter(new EglTemplateFactory());
	}

	@Override
	public HashSet<IModel> getModels(Map<String, Language> inputs, Map<Language, String> outputs, Language output)
			throws EolModelLoadingException, URISyntaxException, IOException {
		// EOL transformation only alters the input model, does not create output model
		HashSet<IModel> out = new HashSet<IModel>();
		ResourceSet set = new ResourceSetImpl();
		for (Map.Entry<String, Language> e : inputs.entrySet()) {
			if (e.getValue() == Language.UATS || e.getValue() == Language.UATV){
				out.add(createEmfModel(e.getValue(), Role.SOURCE, e.getKey(),set));
			}
		}
		//String outputFile = outputs.get(output);
		//String outputFile = "/home/pavlov/proj/playground/galileo2CAPDaut/AUT.xml";
		//out.add(createPlainXmlModel(Language.IMA, Role.TARGET, outputFile));
		out.add(createEmfModel(output, Role.TARGET, outputs.get(output)));
		return out;
	}

	@Override
	public Map<Language, String> getTransformations() {
		Map<Language, String> ret = new HashMap<Language, String>();
		//ret.put(Language.IMA, "transformations/UAT2IMAXML.eol");
		ret.put(Language.IMA, "transformations/UAT2IMA.egl");
		return ret;
	}
/*
	@Override
	public Object execute(Map<String, Language> inputs, Map<Language, String> outputs) throws Exception {
		String outputPath = outputs.get(Language.IMA);
		Object result = super.execute(inputs, outputs);
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(outputPath), "utf-8"))) {
			writer.write(result.toString());
		}
		return result;
	}
*/
}
