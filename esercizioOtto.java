����   = �  &it/edu/iisgubbio/vettori/esercizioOtto  javafx/application/Application N  Ljavafx/scene/control/TextField; K calcola Ljavafx/scene/control/Button; stampa Ljavafx/scene/control/Label; 	risultato stesto rtesto Ntesto Ktesto i I somma numeri [I <init> ()V Code
      javafx/scene/control/TextField
  	    	  !   # javafx/scene/control/Button 
 " &  ' (Ljava/lang/String;)V	  )  	 + javafx/scene/control/Label
 * 	  . 
 	  0   2 la stampa dei numeri è 
 * &	  5   7 il risultato è 	  9   ; inserisci numeri: 	  =   ? k: 	  A   LineNumberTable LocalVariableTable this (Lit/edu/iisgubbio/vettori/esercizioOtto; start (Ljavafx/stage/Stage;)V I javafx/scene/layout/GridPane
 H  L javafx/scene/Scene
 K N  O (Ljavafx/scene/Parent;)V
 H Q R S add (Ljavafx/scene/Node;II)V	 U W V javafx/geometry/Pos X Y CENTER Ljavafx/geometry/Pos;
 H [ \ ] setAlignment (Ljavafx/geometry/Pos;)V@$      
 H a b c setHgap (D)V
 H e f c setVgap h javafx/geometry/Insets
 g j  c
 H l m n 
setPadding (Ljavafx/geometry/Insets;)V   p q r handle E(Lit/edu/iisgubbio/vettori/esercizioOtto;)Ljavafx/event/EventHandler;
 " t u v setOnAction (Ljavafx/event/EventHandler;)V
 x z y javafx/stage/Stage { | setScene (Ljavafx/scene/Scene;)V ~ calcola la somma
 x � � ' setTitle
 x � �  show finestra Ljavafx/stage/Stage; griglia Ljavafx/scene/layout/GridPane; scena Ljavafx/scene/Scene; �  
  � � � getText ()Ljava/lang/String; � ,
 � � � java/lang/String � � split '(Ljava/lang/String;)[Ljava/lang/String;	  �  
 � � � java/lang/Integer � � parseInt (Ljava/lang/String;)I  � � � makeConcatWithConstants 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
 * � � ' setText  � � � (I)Ljava/lang/String; s Ljava/lang/String; num 	vetString [Ljava/lang/String; StackMapTable � main ([Ljava/lang/String;)V
  � � � launch args lambda$0 (Ljavafx/event/ActionEvent;)V
  �   e Ljavafx/event/ActionEvent; 
SourceFile esercizioOtto.java BootstrapMethods
 � � � "java/lang/invoke/LambdaMetafactory � � metafactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; � (Ljavafx/event/Event;)V �
  � � � � �
 � � � $java/lang/invoke/StringConcatFactory � � �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; � � - � il risultato è  InnerClasses � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup !                     	     
                                                            �     r*� *� Y� � *� Y� �  *� "Y$� %� (*� *Y� ,� -*� *Y� ,� /*� *Y1� 3� 4*� *Y6� 3� 8*� *Y:� 3� <*� *Y>� 3� @�    B   .           '  2  =  J  W  d  q  C       r D E    F G    ?     �� HY� JM� KY,� MN,*� � P,*�  � P,*� <� P,*� @� P,*� (� P,*� -� P,*� /� P,*� 4� P,*� 8� P,� T� Z, ^� `, ^� d,� gY ^� i� k*� (*� o  � s+-� w+}� +� ��    B   R       !  #  $ % & / ' 9 ) C * M + W , a - k / r 0 y 1 � 2 � 4 � 5 � 6 � 7 � 8 C   *    � D E     � � �   � � �   � � �        L     ��L=*� � �N-�� �:*��
� �6� !*� �2� �O+2� �  L�����*� 4+� �6� *� �.p� *� �.`=�*� �����*� /� �  � ��    B   B    =  >  @  A  B  C $ D 3 E ? C J H R J X K d L n J { O � P C   H    � D E    � � �   �     | � �   t � �  ! )    U &    �    � $   � � �   	 � �     3     *� ��    B   
    S  T C        � �   � �     9     *� ��    B       4 C        D E      � �   �    � �     �  � � � �  � �  � �   
  � � � 