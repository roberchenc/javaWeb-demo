package erweima.qrcode;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.imageio.ImageIO;

import jp.sourceforge.qrcode.QRCodeDecoder;
import jp.sourceforge.qrcode.exception.DecodingFailedException;

public class ReadQRCode {

	public static void main(String[] args) throws DecodingFailedException, IOException {
		File file = new File("D:/qrcode.png");
		
		BufferedImage bufferedImage = ImageIO.read(file);
		QRCodeDecoder codeDecoder = new QRCodeDecoder ();
		String result = new String(codeDecoder.decode(new MyQRCodeImage(bufferedImage)), "gb2312");
		System.out.println(result);
	}

}
