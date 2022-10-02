package _99_extra;

public class PixelRunner {

	public static void main(String[] args) {
	PixelParty pP = new PixelParty();
	pP.setColor(12, 14, 16);
	pP.setRainbow(true);
	pP.drawCircle(15, 29, 70);
	pP.drawLine(143, 122, 99, 50);
	pP.drawRectangle(34, 57, 6, 77);
	pP.drawTriangle(44, 88, 99, 111, 97, 80);
	pP.saveImage();
	pP.displayImage();
	}

}
