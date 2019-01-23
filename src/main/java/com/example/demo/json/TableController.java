package com.example.demo.json;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TableController {
	
	
	/*public List<TableStructure> getAllDate()
	{
		return Arrays.asList(new TableStructure("83315","RSG7","1","56:59.9","E","File transfer Failed with exception: No transfer required as currentHubId: HUBIDN and ownHubId are same. So marking file transfer as failure.","100","12:39.5","0","0",null,null,null,null,null,"26-01-2019","HUBIDN","HUBIDN",null,"12:39.5","4","0","DT.AR.RSG7.C.E0083315.D181122.T235659.A001"),
							 new TableStructure("83315","TXA4", "1" ,"21-09-2018 02:32", "E", "Transformation failed to complete because of non-zero return code from transformation script", "100", "05:51.9", "1.12E+08", "0",null ,null,null,null,null,"21-09-2018","GFTDTF", "HUBIDN" ,"/sys_apps_01/gfthub/landingzone/loaded/DTF.AR.CTXA4.I00008.E0083315.D0921.A0230001", "05:51.9", "9", "1.17E+08", "DTF.AR.CTXA4.I00008.E0083315.D0921.A0230001")
				
				);
				
	}
*/
	@RequestMapping("/tables")
	public String[][][] getAlldata()
	{
		String arr[][][]=new String[1][1][1];
		arr[0][0][0]="akshay";
		return arr;
			
	}
}
