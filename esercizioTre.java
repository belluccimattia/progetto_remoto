����   = �  %it/edu/iisgubbio/vettori/esercizioTre  javafx/application/Application N  Ljavafx/scene/control/TextField; M riempi Ljavafx/scene/control/Button; calcola stampa Ljavafx/scene/control/Label; 	risultato stesto rtesto Ntesto Mtesto i I somma numeri [I <init> ()V Code
      javafx/scene/control/TextField
  	     	  "   $ javafx/scene/control/Button 
 # '  ( (Ljava/lang/String;)V	  *  	 
	  - 
 	 / javafx/scene/control/Label
 . 	  2  	  4   6 la stampa dei numeri è 
 . '	  9   ; il risultato è 	  =   ? inserisci numro: 	  A   C inserisci i numeri max: 	  E   LineNumberTable LocalVariableTable this 'Lit/edu/iisgubbio/vettori/esercizioTre; start (Ljavafx/stage/Stage;)V M javafx/scene/layout/GridPane
 L  P javafx/scene/Scene
 O R  S (Ljavafx/scene/Parent;)V
 L U V W add (Ljavafx/scene/Node;II)V	 Y [ Z javafx/geometry/Pos \ ] CENTER Ljavafx/geometry/Pos;
 L _ ` a setAlignment (Ljavafx/geometry/Pos;)V@$      
 L e f g setHgap (D)V
 L i j g setVgap l javafx/geometry/Insets
 k n  g
 L p q r 
setPadding (Ljavafx/geometry/Insets;)V   t u v handle D(Lit/edu/iisgubbio/vettori/esercizioTre;)Ljavafx/event/EventHandler;
 # x y z setOnAction (Ljavafx/event/EventHandler;)V  t
 }  ~ javafx/stage/Stage � � setScene (Ljavafx/scene/Scene;)V � calcola la somma
 } � � ( setTitle
 } � �  show finestra Ljavafx/stage/Stage; griglia Ljavafx/scene/layout/GridPane; scena Ljavafx/scene/Scene;
  � � � getText ()Ljava/lang/String;
 � � � java/lang/Integer � � parseInt (Ljava/lang/String;)I	  �  
 � � � java/lang/Math � � random ()D n max StackMapTable �    � � � makeConcatWithConstants '(Ljava/lang/String;I)Ljava/lang/String;
 . � � ( setText  � � � (I)Ljava/lang/String; s Ljava/lang/String; � java/lang/String main ([Ljava/lang/String;)V
  � � � launch args [Ljava/lang/String; lambda$0 (Ljavafx/event/ActionEvent;)V
  �   e Ljavafx/event/ActionEvent; lambda$1
  � 
  
SourceFile esercizioTre.java BootstrapMethods
 � � � "java/lang/invoke/LambdaMetafactory � � metafactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; � (Ljavafx/event/Event;)V �
  � � � � � �
  � � � � �
 � � � $java/lang/invoke/StringConcatFactory � � �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; � � - � il risultato è  InnerClasses � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup !                     	     
 	                                                                 �     *� *� Y� � *� Y� � !*� #Y%� &� )*� #Y+� &� ,*� .Y� 0� 1*� .Y� 0� 3*� .Y5� 7� 8*� .Y:� 7� <*� .Y>� 7� @*� .YB� 7� D�    F   2           '  4  ?  J  W  d  q  ~  G        H I    J K    ^     » LY� NM� OY,� QN,*� � T,*� !� T,*� @� T,*� D� T,*� )� T,*� ,� T,*� 1� T,*� 3� T,*� 8� T,*� <� T,� X� ^, b� d, b� h,� kY b� m� o*� )*� s  � w*� ,*� {  � w+-� |+�� �+� ��    F   Z       !  #  $ % & / ' 9 ( C ) M * W + a , k - u / | 0 � 1 � 2 � 3 � 4 � 5 � 6 � 7 � 8 G   *    � H I     � � �   � � �   � � �         �     B<*� � �� �<*�
� �=*� !� �� �=>� *� �� ��k�`O�*� �����    F   & 	   ;  <  =  >  ? ! @ & A 5 @ A C G   *    B H I    @ �    , �   #     �   	 � &  
      �     ^�L=>� +*� �.� �  L�*� �����*� 8+� �>� *� �.p� *� �.`=�*� �����*� 3� �  � ��    F   2    F  G  H 
 J  H # M + O 0 P ; Q D O P U ] V G   4    ^ H I    [ � �   Y         - #    �    � 
 � 	 � �     3     *� ��    F   
    Y  Z G        � �   � �     9     *� ��    F       3 G        H I      � �  � �     9     *� ñ    F       4 G        H I      � �   �    � �   "  �  � � � �  � � � �  � �  � �   
  � � � 