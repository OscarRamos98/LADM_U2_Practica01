package mx.edu.ittepic.ladm_u2_practica01

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.view.MotionEvent
import android.view.View

class Lienzo(p:MainActivity) : View(p) {
    var puntero = p
    val path = Path()
    var suelo = FiguraGeometrica(0,760,800,1060)
    var tronco = FiguraGeometrica (151,700,35,100)
    var ramasAbajo = FiguraGeometrica(167,690,45)
    var ramasArriba = FiguraGeometrica(167,640,45)
    var paredes = FiguraGeometrica(300,640,300,150)
    var puerta = FiguraGeometrica(461,700,50,90)
    var ventana = FiguraGeometrica(360,690,25)
    var nube1 = FiguraGeometrica(100,150,45)
    var nube2 = FiguraGeometrica(145,125,45)
    var nube3 = FiguraGeometrica(145,175,45)
    var nube4 = FiguraGeometrica(180,150,45)
    var sol = FiguraGeometrica(740,20,60)
    var copo = FiguraGeometrica(30, -315, 10)
    var copo2 = FiguraGeometrica(365, -315, 5)
    var copo3 = FiguraGeometrica(248, -795, 8)
    var copo4 = FiguraGeometrica(490, -95, 13)
    var copo5 = FiguraGeometrica(300, -895, 15)
    var copo6 = FiguraGeometrica(600, -835, 11)
    var copo7 = FiguraGeometrica(520, -715, 9)
    var copo8 = FiguraGeometrica(109, -555, 12)
    var copo9 = FiguraGeometrica(450, -992, 6)
    var copo10 = FiguraGeometrica(86, -611, 14)
    var copo11 = FiguraGeometrica(-160, -911, 7)
    var copo12 = FiguraGeometrica(-120, -211, 4)
    var copo13 = FiguraGeometrica(-60, -311, 16)
    var copo14 = FiguraGeometrica(-20, -711, 17)
    var copo15 = FiguraGeometrica(-100, -511, 20)
    var copo16 = FiguraGeometrica(300, -315, 10)
    var copo17 = FiguraGeometrica(830, -315, 10)
    var copo18 = FiguraGeometrica(451, -315, 10)
    var copo19 = FiguraGeometrica(259, -315, 10)
    var copo20 = FiguraGeometrica(720, -315, 10)


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()
        var triangulo = Paint()
        canvas.drawColor(Color.rgb(212,220,255))

        paint.color = Color.GREEN
        suelo.pintar(canvas,paint)

        paint.color = Color.rgb(118,60,40)
        tronco.pintar(canvas,paint)

        paint.color = Color.GREEN
        ramasAbajo.pintar(canvas,paint)
        ramasArriba.pintar(canvas,paint)

        paint.color = Color.YELLOW
        paredes.pintar(canvas,paint)

        paint.color = Color.BLACK
        puerta.pintar(canvas,paint)

        paint.color = Color.rgb(13,235,240)
        ventana.pintar(canvas,paint)
        paint.style = Paint.Style.STROKE
        paint.color= Color.BLACK
        ventana.pintar(canvas,paint)

        paint.style = Paint.Style.FILL

        paint.color = Color.WHITE
        nube1.pintar(canvas,paint)
        nube2.pintar(canvas,paint)
        nube3.pintar(canvas,paint)
        nube4.pintar(canvas,paint)


        paint.color = Color.YELLOW
        sol.pintar(canvas,paint)


        path.moveTo(300f,640f)
        path.lineTo(600f,640f)
        path.lineTo(440f,500f)
        triangulo.color = Color.RED
        canvas.drawPath(path, triangulo)



        paint.color = Color.rgb(255,255,255)
        copo.pintar(canvas, paint)
        copo2.pintar(canvas, paint)
        copo3.pintar(canvas, paint)
        copo4.pintar(canvas, paint)
        copo5.pintar(canvas, paint)
        copo6.pintar(canvas, paint)
        copo7.pintar(canvas, paint)
        copo8.pintar(canvas, paint)
        copo9.pintar(canvas, paint)
        copo10.pintar(canvas, paint)
        copo11.pintar(canvas, paint)
        copo12.pintar(canvas, paint)
        copo13.pintar(canvas, paint)
        copo14.pintar(canvas, paint)
        copo15.pintar(canvas, paint)
        copo16.pintar(canvas, paint)
        copo17.pintar(canvas, paint)
        copo18.pintar(canvas, paint)
        copo19.pintar(canvas, paint)
        copo20.pintar(canvas, paint)




    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
            }
            MotionEvent.ACTION_MOVE -> {
            }
            MotionEvent.ACTION_UP -> {
            }
        }
        invalidate()
        return true
    }

    fun nevar() {
        copo.nevada(width, height)
        copo2.nevada(width, height)
        copo3.nevada(width, height)
        copo4.nevada(width, height)
        copo5.nevada(width, height)
        copo6.nevada(width, height)
        copo7.nevada(width, height)
        copo8.nevada(width, height)
        copo9.nevada(width, height)
        copo10.nevada(width, height)
        copo11.nevada(width, height)
        copo12.nevada(width, height)
        copo13.nevada(width, height)
        copo14.nevada(width, height)
        copo15.nevada(width, height)
        invalidate()
    }

}