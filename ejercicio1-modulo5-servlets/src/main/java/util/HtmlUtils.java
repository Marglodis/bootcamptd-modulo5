package util;

/**
 * Clase de utilidad para escapar caracteres HTML peligrosos y prevenir XSS
 */

public class HtmlUtils {
	
	/**
	 * Escapa caracteres peligros en una cadena para prevenir inyeccion de scripts
	 * 
	 * @param input Cadena de entrada del usuario
	 * @return Cadena escpada con caracteres HTMl seguros
	 */
	
	public static String escapeHtml(String input) {
		if(input==null) {
			return "";
		}
		return input.replace("&", "&amp;")
				.replace("<", "&lt;")
	            .replace(">", "&gt;")
	            .replace("\"", "&quot;")
	            .replace("'", "&#x27;");
		
	}

}
