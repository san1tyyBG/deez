package ZephrTech;

import android.app.Activity;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.LensShadingMap;
import android.hardware.camera2.params.TonemapCurve;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.view.View;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import deeznutz.lol;

public class DynUtil {

    public static float frame_a_gain = 0;
    public static float frame_d_gain = 0;

    public static View Seeker1 = null;

    public static Activity locoTivity=null;

    static float[][] hol_up = (float[][])null;

    public static void a_gain (float in)
    {
        frame_a_gain = in * 100;
    }

    public static void d_gain (float in)


    {
        frame_d_gain = in * 100;

    }

    private static int ISO()
    {
        //return Math.round(frame_a_gain*frame_d_gain);
        return lol.getISO_Out();
    }


    public static Integer NUM()
    {
        return 5;
    }

    public static float[] WB_R()
    {
        return new float[]{0.50878906f,0.62109375f,0.7226525f,0f,0f};

    }

    public static Float WB_G()
    {
        return 1.00097656f;

    }

    public static float[] WB_B()
    {
        return new float[]{0.70312500f,0.53808594f,0.35156250f,0f,0f};

    }

    public static float[] getPseudoBL(float[] passthough)
    {
        Log.v("deez bl"," ISO "+ISO());
            if (ISO()>0&&ISO()<=50)
            {
                return new float[]{63.75f,63.75f,64.0f,64f};
            }
             else if (ISO()>51&&ISO()<=104)
             {
            return new float[]{63.75f,63.75f,64.0f,64f};
             }
            else if (ISO()>=105&&ISO()<=154)
            {
                return new float[]{63.75f,64f,64.0f,64f};
            }
            else if (ISO()>=155&&ISO()<=204)
            {
                return new float[]{63.75f,64f,64.0f,64f};
            }
            else if (ISO()>=205&&ISO()<=253)
            {
                return new float[]{63.75f,64f,64.0f,64f};
            }
            else if (ISO()>=254&&ISO()<=302)
            {
                return new float[]{64f,64f,64.0f,64f};
            }
            else if (ISO()>=303&&ISO()<=351)
            {
                return new float[]{63.75f,64f,64.0f,63.75f};
            }
            else if (ISO()>=352&&ISO()<=400)
            {
                return new float[]{63.75f,64f,64f,63.75f};
            }
            else if (ISO()>=401&&ISO()<=454)
            {
                return new float[]{64f,64f,64f,64f};
            }
            else if (ISO()>=455&&ISO()<=503)
            {
                return new float[]{63.75f,64f,64.0f,63.75f};
            }
            else if (ISO()>=504&&ISO()<=553)
            {
                return new float[]{63.75f,64f,64.0f,63.75f};
            }
            else if (ISO()>=554&&ISO()<=604)
            {
                return new float[]{63.75f,64f,64.0f,64f};
            }
            else if (ISO()>=605&&ISO()<=654)
            {
                return new float[]{63.75f,64f,64.0f,64f};
            }
            else if (ISO()>=655&&ISO()<=704)
            {
                return new float[]{63.75f,64f,64.0f,64f};
            }
            else if (ISO()>=705&&ISO()<=753)
            {
                return new float[]{64f,64f,64f,64f};
            }
            else if (ISO()>=754&&ISO()<=803)
            {
                return new float[]{63.75f,64f,64.0f,64f};
            }
            else if (ISO()>=804&&ISO()<=854)
            {
                return new float[]{63.75f,64f,64.0f,63.75f};
            }
            else if (ISO()>=855&&ISO()<=904)
            {
                return new float[]{64f,64.25f,64.25f,64f};
            }
            else if (ISO()>=905&&ISO()<=954)
            {
                return new float[]{64,64f,64.0f,64};
            }
            else if (ISO()>=955&&ISO()<=1003)
            {
                return new float[]{64,64.25f,64.25f,64};
            }
            else if (ISO()>=1004&&ISO()<=1053)
            {
                return new float[]{64,64f,64.0f,64};
            }
            else if (ISO()>=1054&&ISO()<=1104)
            {
                return new float[]{64,64f,64.0f,64f};
            }
            else if (ISO()>=1105&&ISO()<=1154)
            {
                return new float[]{64,64f,64.0f,64};
            }
            else if (ISO()>=1155&&ISO()<=1204)
            {
                return new float[]{63.75f,64.25f,64.25f,64f};
            }
            else if (ISO()>=1205&&ISO()<=1253)
            {
                return new float[]{63.75f,64.25f,64.0f,63.75f};
            }
            else if (ISO()>=1254&&ISO()<=1303)
            {
                return new float[]{64,64.5f,64.25f,64};
            }
            else if (ISO()>=1304&&ISO()<=1354)
            {
                return new float[]{64f,63.75f,64,64};
            }
            else if (ISO()>=1355&&ISO()<=1404)
            {
                return new float[]{64,64.5f,63.75f,64f};
            }
            else if (ISO()>=1405&&ISO()<=1454)
            {
                return new float[]{63.75f,64.5f,64.25f,64f};
            }
            else if (ISO()>=1455&&ISO()<=1503)
            {
                return new float[]{63.75f,64f,63.75f,63.75f};
            }
            else if (ISO()>=1504&&ISO()<=1553)
            {
                return new float[]{64,64.5f,64.25f,64f};
            }
            else if (ISO()>=1554&&ISO()<=1604)
            {
                return new float[]{63.75f,64.5f,64.25f,64};
            }
            else if (ISO()>=1605&&ISO()<=1654)
            {
                return new float[]{64,64.25f,64.0f,64};
            }
            else if (ISO()>=1655&&ISO()<=1704)
            {
                return new float[]{63.75f,64.5f,64.25f,63.75f};
            }
            else if (ISO()>=1705&&ISO()<=1753)
            {
                return new float[]{64,64f,63.75f,64};
            }
            else if (ISO()>=1754&&ISO()<=1803)
            {
                return new float[]{64,64f,63.75f,64.25f};
            }
            else if (ISO()>=1804&&ISO()<=1854)
            {
                return new float[]{64,64.25f,64.0f,64.25f};
            }else if (ISO()>=1855&&ISO()<=1904)
            {
                return new float[]{63.75f,64.5f,64.25f,63.75f};
            }
            else if (ISO()>=1905&&ISO()<=1954)
            {
                return new float[]{63.75f,64.5f,64.25f,63.75f};
            }
            else if (ISO()>=1955&&ISO()<=2003)
            {
                return new float[]{63.75f,64.5f,64.25f,63.75f};
            }
            else if (ISO()>=2004&&ISO()<=2053)
            {
                return new float[]{64.25f,64.5f,64.25f,64.25f};
            }
            else if (ISO()>=2054&&ISO()<=2104)
            {
                return new float[]{64,64.5f,64,64};
            }
            else if (ISO()>=2105&&ISO()<=2154)
            {
                return new float[]{63.75f,64.25f,63.75f,64f};
            }
            else if (ISO()>=2155&&ISO()<=2204)
            {
                return new float[]{63.75f,64.25f,63.75f,64};
            }else if (ISO()>=2205&&ISO()<=2253)
            {
                return new float[]{63.75f,64.25f,64.0f,64};
            }
            else if (ISO()>=2254&&ISO()<=2303)
            {
                return new float[]{63.75f,64.5f,64.25f,64};
            }
            else if (ISO()>=2304&&ISO()<=2354)
            {
                return new float[]{64,63.75f,64.0f,64};
            }
            else if (ISO()>=2355&&ISO()<=2404)
            {
                return new float[]{64.25f,64f,63.75f,64.25f};
            }
            else if (ISO()>=2405&&ISO()<=2454)
            {
                return new float[]{64.25f,65,64.5f,64.25f};
            }else if (ISO()>=2455&&ISO()<=2503)
            {
                return new float[]{63.5f,64.25f,64.0f,64.75f};
            }
            else if (ISO()>=2504&&ISO()<=2553)
            {
                return new float[]{64,64.25f,64.0f,64};
            }
            else if (ISO()>=2554&&ISO()<=2604)
            {
                return new float[]{63.75f,64.5f,64.25f,63.75f};
            }
            else if (ISO()>=2605&&ISO()<=2654)
            {
                return new float[]{63.75f,64.5f,64.25f,63.75f};
            }
            else if (ISO()>=2655&&ISO()<=2704)
            {
                return new float[]{64,64.75f,64.5f,64};
            }
            else if (ISO()>=2705&&ISO()<=2753)
            {
                return new float[]{63.75f,64.5f,64.0f,64};
            }
            else if (ISO()>=2754&&ISO()<=2803)
            {
                return new float[]{63.75f,64.5f,64.0f,63.75f};
            }
            else if (ISO()>=2804&&ISO()<=2854)
            {
                return new float[]{63.75f,64.75f,64.5f,63.75f};
            }
            else if (ISO()>=2855&&ISO()<=2904)
            {
                return new float[]{63.75f,64.5f,64.0f,64};
            }
            else if (ISO()>=2905&&ISO()<=2954)
            {
                return new float[]{64,64.75f,64.5f,64};
            }
            else if (ISO()>=2955&&ISO()<=3003)
            {
                return new float[]{63.75f,65f,64.75f,63.75f};
            }
            else if (ISO()>=3004&&ISO()<=3053)
            {
                return new float[]{64,65,64.5f,64};
            }
            else if (ISO()>=3054&&ISO()<=3104)
            {
                return new float[]{63.5f,64.5f,64.25f,63.75f};
            }
            else if (ISO()>=3105&&ISO()<=3154)
            {
                return new float[]{63.75f,65,64.75f,64};
            }
            else if (ISO()>=3155&&ISO()<=6309)
            {
                return new float[]{64.5f,64.75f,64.5f,64.5f};
            }else if (ISO()>=6310&&ISO()<=12619)
            {
                return new float[]{64.25f,67f,66.5f,64.5f};
            }
            else if (ISO()>=12620&&ISO()<=25239)
            {
                return new float[]{67.5625f,83.0625f,82.125f,68.4375f};
            }
            else if (ISO()>=25240&&ISO()<=35199)
            {
                return new float[]{87.8125f,127.375f,126.125f,87.3125f};
            }
            else if (ISO()>=35200&&ISO()<=50479)
            {
                return new float[]{98.125f,151.125f,149.9375f,99.9375f};
            }
            else if (ISO()>=50480&&ISO()<=70399)
            {
                return new float[]{136.625f,231.8125f,230.1875f,139f};
            }
            else if (ISO()>=70400&&ISO()<=93499) {
                return new float[]{157.1875f, 281.4375f, 279.75f, 160.625f};
            }

            else if (ISO()>=93500&&ISO()<=113777*2)
            {
                return new float[]{196.8125f,349.625f,347.5f,200.75f};
            }
            else if(passthough[0]==63) {
                return new float[]{63.75f,63.75f,64.0f,67.75f};
            }
            else  {
                return passthough;
            }







    }

    public static void dumpLSCtoFile(LensShadingMap lsc)
    {
        try {
            FileOutputStream fi = new FileOutputStream(new File(Environment.DIRECTORY_DCIM+"/lsc.dat"));
            ObjectOutputStream o = new ObjectOutputStream(fi);

            o.writeObject(lsc);
            o.close();
            fi.close();
        }
        catch (FileNotFoundException ex){}
        catch (IOException ex){}
        catch (ClassCastException ex){}
        catch (Exception ex){

        }
    }

    public static void curveDeezNuts(TotalCaptureResult totalCaptureResult)
    {
        try {


            if (totalCaptureResult != null) {
                TonemapCurve tonemapCurve = (TonemapCurve) totalCaptureResult.get(CaptureResult.TONEMAP_CURVE);

                if (tonemapCurve != null) {
                    float[][] curve = new float[3][];
                    hol_up = new float[3][];
                    for (int i = 0; i <= 2; i++) {
                        curve[i] = new float[2 * tonemapCurve.getPointCount(i)];

                        Log.d("deez Curve", ": "+curve[i]);

                        tonemapCurve.copyColorCurve(i, curve[i], 0);
                    }


                    hol_up = curve;

                }
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public static TonemapCurve staticCurve()
    {
        return new TonemapCurve(hol_up[0],hol_up[1],hol_up[2]);
    }


    public static void setSeeker(View v)
    {
        Seeker1 = v;
    }

    public static void seekerHide(boolean b)
    {
        if (b)
        {
            Seeker1.setVisibility(View.GONE);
        }
        else {
            Seeker1.setVisibility(View.VISIBLE);
        }
    }

}
