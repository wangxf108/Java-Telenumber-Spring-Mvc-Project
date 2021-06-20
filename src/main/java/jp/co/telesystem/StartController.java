package jp.co.telesystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.telesystem.model2.TeleModel;

@Controller
public class StartController {

	@RequestMapping(value ="/addTele", method = RequestMethod.GET )
	public String doAdd(Model xiaYiGe) {
		TeleModel t = new TeleModel();
		t.setUserName("");
		t.setTeleNum("");

		xiaYiGe.addAttribute("KONGBAI", t);


		return "addpage";
	}

}
