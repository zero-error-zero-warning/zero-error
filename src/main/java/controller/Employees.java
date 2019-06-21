package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/employee")
public class Employees {




	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	@RequestMapping("employeeLogin")
	//下面的对传入参数指定为参数名 如果前端不传指定的参数名，会报错
	public List<Map<String,Object>> employeeLogin(@RequestBody List<Map<String,Object>> list) {

		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).get("username"));
		}


		Map map1=new HashMap();
		map1.put("taus","1");
		map1.put("employeeName","zs");
		map1.put("employeeId","12345678900");
		Map map2=new HashMap();
		map2.put("taus","1");
		map2.put("employeeName","ls");
		map2.put("employeeId","12349978900");
		Map map3=new HashMap();
		map3.put("taus","1");
		map3.put("employeeName","ww");
		map3.put("employeeId","12785678900");


		List list1=new ArrayList();
		list1.add(map1);
		list1.add(map2);
		list1.add(map3);
		return  list1;

	}

}
