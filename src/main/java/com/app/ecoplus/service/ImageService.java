package com.app.ecoplus.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;


@Service
public class ImageService {

	public Map<String, String> imagesIndex(){
		Map<String, String> imageMap = new HashMap<>();

//		Logo
		imageMap.put("LogoCinza", "/img/logo/LogoCinza.png");
		imageMap.put("LogoPreta","/img/logo/LogoPreta.png");

	    imageMap.put("Imagem1", "/img/imagem 1.jpg");
		imageMap.put("Imagem2", "/img/imagem 2.jpg");
		imageMap.put("Imagem3", "/img/imagem 3.jpg");
		imageMap.put("Imagem4", "/img/imagem 4.jpg");
		imageMap.put("Cadastro", "/img/cadastro.jpg");
		imageMap.put("Residuos", "/img/residuos.jpg");
		imageMap.put("Conexão", "/img/conexão.jpg");
		imageMap.put("Negociação", "/img/negociação.jpg");
	    return imageMap;
	}

	public Map<String, String> imagesSobrenos() {
		Map<String, String> imageMap = new HashMap<>();
//		Logo
		imageMap.put("LogoCinza","/img/logo/LogoCinza.png");
		imageMap.put("LogoPreta","/img/logo/LogoPreta.png");
//		Dev images
		imageMap.put("AlineImg", "/img/devs/AlineGomes.png");
		imageMap.put("EdImg", "/img/devs/EdmilsonJunior.png");
		imageMap.put("LucasAntonioImg", "/img/devs/LucasAntonio.png");
		imageMap.put("LucasTavaresImg", "/img/devs/LucasTavares.png");
		imageMap.put("ThallesImg", "/img/devs/ThallesVieira.png");

		return imageMap;
	}

	public Map <String, String> imagesPassword() {
		Map <String, String> imageMap = new HashMap<>();

	//		Logo
		imageMap.put("LogoCinza","/img/logo/LogoCinza.png");
		imageMap.put("LogoPreta","/img/logo/LogoPreta.png");
		return imageMap;

	}
	public Map <String, String> imagesLogin() {
		Map <String, String> imageMap = new HashMap<>();

		//		Logo
			imageMap.put("LogoCinza","/img/logo/LogoCinza.png");
			imageMap.put("LogoPreta","/img/logo/LogoPreta.png");


			imageMap.put("Facebook", "/img/facebook.png");
			imageMap.put("Twitter", "/img/twitter.png");
			imageMap.put("Google", "/img/google.png");
			return imageMap;

	}

	public Map<String, String> imagesFaq(){
		Map <String, String> imageMap = new HashMap<>();

		//		Logo
			imageMap.put("LogoCinza","/img/logo/LogoCinza.png");
			imageMap.put("LogoPreta","/img/logo/LogoPreta.png");
			return imageMap;

	}


	public Map<String, String> imagesForm(){
		Map <String, String> imageMap = new HashMap<>();

		//		Logo
			imageMap.put("LogoCinza","/img/logo/LogoCinza.png");
			imageMap.put("LogoPreta","/img/logo/LogoPreta.png");
			return imageMap;

	}
	public Map<String, String> imagesVendas(){
		Map <String, String> imageMap = new HashMap<>();

		//		Logo
		imageMap.put("LogoCinza","/img/logo/LogoCinza.png");
		imageMap.put("LogoPreta","/img/logo/LogoPreta.png");


		imageMap.put("residuos","/img/residuos.jpg");
		return imageMap;

	}


	public Map<String, String> imagesInfo(){
		Map <String, String> imageMap = new HashMap<>();

		//		Logo
		imageMap.put("LogoCinza","/img/logo/LogoCinza.png");
		imageMap.put("LogoPreta","/img/logo/LogoPreta.png");

		imageMap.put("resi1","static/img/card/card/resi1.jpg");
		imageMap.put("resi2","static/img/card/card/resi2.jpg");
		imageMap.put("resi3","static/img/card/card/resi3.jpg");
		imageMap.put("resi4","static/img/card/card/resi4.jpg");
		return imageMap;

	}
}
