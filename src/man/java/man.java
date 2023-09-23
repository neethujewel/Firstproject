package man.java;

import java.awt.image.DataBuffer;
import java.awt.image.SampleModel;

public class man extends SampleModel {
    @Override
    public int getNumDataElements() {
        return 0;
    }

    @Override
    public Object getDataElements(int x, int y, Object obj, DataBuffer data) {
        return null;
    }

    @Override
    public void setDataElements(int x, int y, Object obj, DataBuffer data) {

    }

    @Override
    public int getSample(int x, int y, int b, DataBuffer data) {
        return 0;
    }

    @Override
    public void setSample(int x, int y, int b, int s, DataBuffer data) {

    }

    @Override
    public SampleModel createCompatibleSampleModel(int w, int h) {
        return null;
    }

    @Override
    public SampleModel createSubsetSampleModel(int[] bands) {
        return null;
    }

    @Override
    public DataBuffer createDataBuffer() {
        return null;
    }

    @Override
    public int[] getSampleSize() {
        return new int[0];
    }

    @Override
    public int getSampleSize(int band) {
        return 0;
    }

    SampleModel S1=new man;()
    SampleModel S2=new man();
    int  S1,S2;
    S1.a =20;
    S2.b =50;
    S1.b =100;
    S2.a =200;


System.out.println("S1.a:" + S1.b"+s2.a :" S2.b: "+S1.a);
}
s1
