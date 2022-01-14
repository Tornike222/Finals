����   4
 androidx/core/graphics/RectKt  java/lang/Object  
component1 (Landroid/graphics/Rect;)I #Lorg/jetbrains/annotations/NotNull; <this>  kotlin/jvm/internal/Intrinsics 
 checkNotNullParameter '(Ljava/lang/Object;Ljava/lang/String;)V  
   android/graphics/Rect  left I  	   $i$f$component1 $this$component1 Landroid/graphics/Rect; 
component2 top  	   $i$f$component2 $this$component2 
component3 right   	  ! $i$f$component3 $this$component3 
component4 bottom & 	  ' $i$f$component4 $this$component4 (Landroid/graphics/RectF;)F android/graphics/RectF , F  .	 - / Landroid/graphics/RectF;  .	 - 2   .	 - 4 & .	 - 6 plus G(Landroid/graphics/Rect;Landroid/graphics/Rect;)Landroid/graphics/Rect; r : <init> (Landroid/graphics/Rect;)V < =
  > union @ =
  A $i$a$-apply-RectKt$plus$1 $this$plus_u24lambda_u2d0 	$i$f$plus 
$this$plus J(Landroid/graphics/RectF;Landroid/graphics/RectF;)Landroid/graphics/RectF; (Landroid/graphics/RectF;)V < H
 - I @ H
 - K $i$a$-apply-RectKt$plus$2 $this$plus_u24lambda_u2d1 1(Landroid/graphics/Rect;I)Landroid/graphics/Rect; offset (II)V P Q
  R $i$a$-apply-RectKt$plus$3 $this$plus_u24lambda_u2d2 xy 3(Landroid/graphics/RectF;F)Landroid/graphics/RectF; (FF)V P X
 - Y $i$a$-apply-RectKt$plus$4 $this$plus_u24lambda_u2d3 H(Landroid/graphics/Rect;Landroid/graphics/Point;)Landroid/graphics/Rect; V android/graphics/Point _ x a 	 ` b y d 	 ` e $i$a$-apply-RectKt$plus$5 $this$plus_u24lambda_u2d4 Landroid/graphics/Point; K(Landroid/graphics/RectF;Landroid/graphics/PointF;)Landroid/graphics/RectF; android/graphics/PointF k a .	 l m d .	 l o $i$a$-apply-RectKt$plus$6 $this$plus_u24lambda_u2d5 Landroid/graphics/PointF; minus I(Landroid/graphics/Rect;Landroid/graphics/Rect;)Landroid/graphics/Region; android/graphics/Region v
 w > android/graphics/Region$Op y 
DIFFERENCE Landroid/graphics/Region$Op; { |	 z } op 6(Landroid/graphics/Rect;Landroid/graphics/Region$Op;)Z  �
 w � $i$a$-apply-RectKt$minus$1 $this$minus_u24lambda_u2d6 Landroid/graphics/Region; 
$i$f$minus $this$minus K(Landroid/graphics/RectF;Landroid/graphics/RectF;)Landroid/graphics/Region; ()V < �
  � roundOut � =
 - � $i$f$toRect r$iv $this$toRect$iv $i$a$-apply-RectKt$minus$2 $this$minus_u24lambda_u2d7 $i$a$-apply-RectKt$minus$3 $this$minus_u24lambda_u2d8 $i$a$-apply-RectKt$minus$4 $this$minus_u24lambda_u2d9 $i$a$-apply-RectKt$minus$5 $this$minus_u24lambda_u2d10 $i$a$-apply-RectKt$minus$6 $this$minus_u24lambda_u2d11 times $i$a$-apply-RectKt$times$1 $this$times_u24lambda_u2d12 
$i$f$times $this$times factor 3(Landroid/graphics/RectF;I)Landroid/graphics/RectF; $i$a$-apply-RectKt$times$2$iv $this$times_u24lambda_u2d13$iv $this$times$iv 	factor$iv $i$a$-apply-RectKt$times$2 $this$times_u24lambda_u2d13 or $i$a$-apply-RectKt$plus$1$iv $this$plus_u24lambda_u2d0$iv $this$plus$iv $i$f$or $this$or $i$a$-apply-RectKt$plus$2$iv $this$plus_u24lambda_u2d1$iv and !Landroid/annotation/SuppressLint; value CheckResult 	intersect (Landroid/graphics/Rect;)Z � �
  � $i$a$-apply-RectKt$and$1 $this$and_u24lambda_u2d14 $i$f$and 	$this$and (Landroid/graphics/RectF;)Z � �
 - � $i$a$-apply-RectKt$and$2 $this$and_u24lambda_u2d15 xor XOR � |	 z � $i$a$-apply-RectKt$xor$1 $this$xor_u24lambda_u2d16 $i$f$xor 	$this$xor $i$a$-apply-RectKt$xor$2 $this$xor_u24lambda_u2d17 contains 2(Landroid/graphics/Rect;Landroid/graphics/Point;)Z p � (II)Z � �
  � $i$f$contains $this$contains 4(Landroid/graphics/RectF;Landroid/graphics/PointF;)Z (FF)Z � �
 - � toRectF 1(Landroid/graphics/Rect;)Landroid/graphics/RectF;
 - > $i$f$toRectF $this$toRectF toRect 1(Landroid/graphics/RectF;)Landroid/graphics/Rect; $this$toRect toRegion 2(Landroid/graphics/Rect;)Landroid/graphics/Region; $i$f$toRegion $this$toRegion 3(Landroid/graphics/RectF;)Landroid/graphics/Region; 	transform K(Landroid/graphics/RectF;Landroid/graphics/Matrix;)Landroid/graphics/RectF; m � android/graphics/Matrix � mapRect � �
 � � $i$a$-apply-RectKt$transform$1 $this$transform_u24lambda_u2d18 $i$f$transform $this$transform Landroid/graphics/Matrix; Lkotlin/Metadata; mv       k    xi   0 d1I��<
��

��

��




��




	

��0*020H��0*020H0*0H
0*0H
0*0H
0*0H
0*0H
0*0H
	0*0H
	0*0H

0*020H

0*020H
0*020H
0*020H
0*020H
0*020H
0*020H
0*020H
0*020H0*020H0*020H
0*020H
0*020H
0*020H
0*020H
0*020H
0*020H
0*020H
0*020H
0*0H0*0H0*0H0*0H0*020H0*020H0*020H¨ d2   core-ktx_release Rect.kt Code LineNumberTable LocalVariableTable $RuntimeInvisibleParameterAnnotations RuntimeInvisibleAnnotations 
SourceFile SourceDebugExtension RuntimeVisibleAnnotations 1       $       A     *	� <*� �         &                              A     *	� <*� �         1                              A     *	� <*� "�         <       #     