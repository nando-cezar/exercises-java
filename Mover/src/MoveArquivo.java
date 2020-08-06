import java.io.File;

public class MoveArquivo {

	public static void main(String[] args){
		listaDiretorio();
	}

	/**
	 * Este método recebe um File como parâmetro e o move para  o sub-diretório importados.
	 * @param file representa um arquivo.
	 */
	public static void moveFile(File file){
		//String fullPath = path + "\\importados";
		//File file = new File("docto\\sobre.txt");
		String currentPath = file.getPath().replace("\\" + file.getName(), "");
		file.renameTo(new File(currentPath + "\\importados", file.getName()));
	}
	
	/**
	 * Cria a pasta chamada [importados]
	 * Obs: este método só criará a pasta se ele não existir. Caso contrário nada acontece.
	 * @param currentPath representa um diretório
	 */
	public static void criaPastaEm(String currentPath) {
		String fullPath = currentPath + "\\importados";
		File newDir = new File(fullPath);
		if(!(newDir.exists()) && newDir.mkdir()){
			System.out.println("Criou pasta " + fullPath );
		}
	}
	
	public static void listaDiretorio(){
		File dir = new File(".");
		File[] files = dir.listFiles();
		for(File file: files){
			if(file.getAbsolutePath().toUpperCase().endsWith("TXT")){
				try {
					criaPastaEm(dir.getAbsolutePath());
					moveFile(file);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("fim");
	}
	
}