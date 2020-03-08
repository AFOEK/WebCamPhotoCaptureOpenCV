package webcamphotocaptureopencv;

import org.opencv.core.Core;
import org.opencv.highgui.VideoCapture;
import java.awt.image.BufferedImage;

public class VideoCap {
    static{
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }
    
    VideoCapture cap;
    Mat2Img mat2img = new Mat2Img();
    
    VideoCap()
    {
        cap=new VideoCapture();
        cap.open(0);
    }
    
    BufferedImage getOneFrame()
    {
        cap.read(mat2img.mat);
        return mat2img.getImage(mat2img.mat);
    }
}

