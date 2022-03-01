package com.xworkz.product.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.product.dto.ProductDTO;
import com.xworkz.product.entity.ProductEntity;
import com.xworkz.product.service.ProductService;

@Component
@RequestMapping("/")
public class WebBean {

	@Autowired
	private ProductService service;

	public WebBean() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@RequestMapping("product.do")
	public String onSaveProduct(ProductDTO productDTO,Model model) {
		System.out.println("Invoked product method");

		System.out.println(productDTO);
		ProductEntity entity = new ProductEntity(productDTO.getName(), productDTO.getType(), productDTO.getQuantity(), productDTO.getPrice());
		boolean savedData=service.validateAndSave(entity);
		if(savedData) {
			System.out.println();
			model.addAttribute("message","Product is saved successfully ".concat(productDTO.getName()));
		}
		else {
			System.out.println();
			model.addAttribute("message", "Product is not saved");
		}
		return "/ProductRegister.jsp";
	}
}
