package meh.the1gamers.plugins.carepackage.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CarePackageAPI {

	public static List<String> carepackages = new ArrayList<String>();
	
	public static Map<String, CarePackageBase> carepackages1;
	
	public static void init()
	{
		CarePackageBase example = new CarePackageBase();
	}

}
