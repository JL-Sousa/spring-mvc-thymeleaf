package com.br.tecodev.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.br.tecodev.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Echo Dot (4ª Geração)");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/41Lcc2WSvhL._AC_.jpg");
		pedido.setUrlProduto(
				"https://www.amazon.com.br/dp/B084DWCZY6/ref=ATFDESK_dot_c?pf_rd_r=SKWNM7572J5QGH0X9B6T&pf_rd_p=b3d10ea2-67f4-4ca2-a5d2-5345ef1c8db5&pd_rd_r=04c6256c-73c5-4bff-888a-821ea1dfe3a4&pd_rd_w=FWgcx&pd_rd_wg=3tmEw&ref_=pd_gw_unk");
		pedido.setDescricao("Uma descricao qualquer para este pedido.");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}

}
