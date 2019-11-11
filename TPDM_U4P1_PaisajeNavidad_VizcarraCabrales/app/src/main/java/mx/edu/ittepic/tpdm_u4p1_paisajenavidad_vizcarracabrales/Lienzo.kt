package mx.edu.ittepic.tpdm_u4p1_paisajenavidad_vizcarracabrales

import android.graphics.*
import android.view.View

class Lienzo(puntero: MainActivity) : View(puntero) {

    var luna = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources,R.drawable.luna),200,200,false)

    override fun onDraw(c: Canvas) {
        super.onDraw(c)

        setBackgroundColor(Color.rgb(21,67,96))

        val p = Paint()

        c.drawBitmap(luna,width/2f,100f,p)
        p.color = Color.rgb(214,234,248)
        c.drawCircle(0f,width+(height/2)+0f,width+0f,p)
        c.drawCircle(width+0f,width+(height/4)+0f,width+0f,p)

        var nubex = 100f
        var nubey = 150f
        p.color = Color.WHITE
        c.drawCircle(nubex,nubey,60f,p)
        c.drawCircle(nubex+70,nubey-60,60f,p)
        c.drawCircle(nubex+80,nubey+30,60f,p)
        c.drawCircle(nubex+140,nubey-30,60f,p)

        p.color = Color.rgb(147,81,22)
        c.drawRect(width/4f,height-height/4f,width/4f + 40,height-height/4f+80,p)
        p.color = Color.rgb(46,204,113)
        c.drawCircle(width/4f+20,height-height/4f-50,60f,p)
        c.drawCircle(width/4f+20,height-height/4f-90,55f,p)

        p.color = Color.rgb(147,81,22)
        c.drawRect(190+width-width/4f,height-height/4f,190+width-width/4f + 40,height-height/4f+80,p)
        p.color = Color.rgb(46,204,113)
        c.drawCircle(200+width-width/4f-30,height-height/4f-10,40f,p)
        c.drawCircle(200+width-width/4f+30,height-height/4f-15,45f,p)
        c.drawCircle(200+width-width/4f-20,height-height/4f-20,40f,p)
        c.drawCircle(200+width-width/4f+30,height-height/4f-30,40f,p)
        c.drawCircle(200+width-width/4f-20,height-height/4f-60,40f,p)
        c.drawCircle(200+width-width/4f+25,height-height/4f-60,40f,p)
        c.drawCircle(200+width-width/4f+20,height-height/4f-100,40f,p)

        p.color = Color.WHITE
        c.drawCircle(width*3/4f, height*3/4f+30, 40f,p)
        c.drawCircle(width*3/4f, height*3/4f-30, 35f,p)

        p.color = Color.rgb(147,81,22)
        c.drawRect(width*3/4f-30,height*3/4f-60,width*3/4f+30,height*3/4f-65,p)
        c.drawRect(width*3/4f-20,height*3/4f-120,width*3/4f+20,height*3/4f-65,p)
        p.color = Color.BLACK
        c.drawCircle(width*3/4f-15, height*3/4f-35, 5f,p)
        c.drawCircle(width*3/4f+15, height*3/4f-35, 5f,p)
        c.drawLine(width*3/4f-10,height*3/4f-15,width*3/4f+10,height*3/4f-15,p)
        c.drawLine(width*3/4f-20,height*3/4f+10,width*3/4f-50,height*3/4f-30,p)
        c.drawLine(width*3/4f+20,height*3/4f+10,width*3/4f+50,height*3/4f-30,p)
        p.color = Color.rgb(243,156,18)
        c.drawLine(width*3/4f,height*3/4f-30,width*3/4f+5,height*3/4f-25,p)
        c.drawLine(width*3/4f,height*3/4f-20,width*3/4f+5,height*3/4f-25,p)
    }
}