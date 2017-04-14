package cc.it120.www.servletFreemarker.method;

import java.util.List;

import com.google.common.base.Strings;

import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;

public class SleepMethod implements TemplateMethodModelEx {
	
	@SuppressWarnings("rawtypes")
	@Override
	public Object exec(List arguments) throws TemplateModelException {
		
		String str = String.valueOf(arguments.get(0));
		if (Strings.isNullOrEmpty(str)) {
			str = "1000";
		}
		long miniSeconds = Long.parseLong(str);
		try {
			Thread.sleep(miniSeconds);
		} catch (Exception e) {}
		
		return "";
	}

}
