package jp.co.telesystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.telesystem.model2.TeleModel;

@Controller
public class AddController {

	@RequestMapping(value ="/doAddDB", method = RequestMethod.POST )
	public String insertDB(@ModelAttribute("KONGBAI") TeleModel huamian, Model xia) {

		String u =huamian.getUserName();
		String t =huamian.getTeleNum();

		DAO d =new DAO();
		String jieguo =d.insertTele(u, t);

		if("成功".equals(jieguo)) {

			return "okpage";

		}else {

			return "errorpage";

		}
	}
}
