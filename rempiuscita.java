����   =  $it/edu/iisgubbio/vettori/rempiuscita  javafx/application/Application alloca Ljavafx/scene/control/Button; 	inserisci stampa calcola tNumero  Ljavafx/scene/control/TextField; tquanti 	risultato Ljavafx/scene/control/Label; elenco Media maggiore minore 	contatore media D tempi [I pos I quanti inseriti <init> ()V Code
      " javafx/scene/control/Button 
 ! %  & (Ljava/lang/String;)V	  (   	  +   	  .   		  1 	  3 javafx/scene/control/TextField
 2  	  6 
 	  8   : javafx/scene/control/Label
 9  	  =   
 9 %	  A   	  D   	  G   	  J   L 10	  N  	  P  	  R   T 	grandezza	  V   LineNumberTable LocalVariableTable this &Lit/edu/iisgubbio/vettori/rempiuscita; start (Ljavafx/stage/Stage;)V ^ javafx/scene/layout/GridPane
 ]   a javafx/scene/Scene
 ` c  d (Ljavafx/scene/Parent;)V
 ] f g h add (Ljavafx/scene/Node;II)V	 j l k javafx/geometry/Pos m n CENTER Ljavafx/geometry/Pos;
 ] p q r setAlignment (Ljavafx/geometry/Pos;)V@$      
 ] v w x setHgap (D)V
 ] z { x setVgap } javafx/geometry/Insets
 |   x
 ] � � � 
setPadding (Ljavafx/geometry/Insets;)V   � � � handle C(Lit/edu/iisgubbio/vettori/rempiuscita;)Ljavafx/event/EventHandler;
 ! � � � setOnAction (Ljavafx/event/EventHandler;)V  �  �  �
 � � � javafx/stage/Stage � � setScene (Ljavafx/scene/Scene;)V � calcola la media di 10 numeri
 � � � & setTitle
 � � �  show finestra Ljavafx/stage/Stage; griglia Ljavafx/scene/layout/GridPane; scena Ljavafx/scene/Scene;
 2 � � � getText ()Ljava/lang/String;
 � � � java/lang/Integer � � parseInt (Ljava/lang/String;)I	  �    � � � makeConcatWithConstants (I)Ljava/lang/String;
 9 � � & setText	  �   inserisciTempo �  
 2 �  � StackMapTable  � � � '(Ljava/lang/String;I)Ljava/lang/String;  � � � (D)Ljava/lang/String; s Ljava/lang/String; somma i � java/lang/String  � 	 � 
 � � � &(Ljava/lang/String;)Ljava/lang/String;  � mag min e main ([Ljava/lang/String;)V
  � � � launch args [Ljava/lang/String; lambda$0 (Ljavafx/event/ActionEvent;)V
  �   Ljavafx/event/ActionEvent; lambda$1
  � 	  lambda$2
  �   lambda$3
  � �  
SourceFile rempiuscita.java BootstrapMethods
 � � � "java/lang/invoke/LambdaMetafactory � � metafactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; � (Ljavafx/event/Event;)V �
  � � � � � �
  � � � � � �
  � � � � � �
  � � �

	 $java/lang/invoke/StringConcatFactory � �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;  - i numeri maggiori:  i numeri minori sono:  InnerClasses %java/lang/invoke/MethodHandles$Lookup java/lang/invoke/MethodHandles Lookup !                          	      
                                                                                        �*� *� !Y#� $� '*� !Y)� $� **� !Y,� $� -*� !Y/� $� 0*� 2Y� 4� 5*� 2Y� 4� 7*� 9Y� ;� <*� 9Y>� ?� @*� 9YB� ?� C*� 9YE� ?� F*� 9YH� ?� I*� 9YK� ?� M*� O*� Q*� 9YS� ?� U�    W   F           +  8  C  N  Y  f  s  �  �  �  �  �  �  X       � Y Z    [ \    �     � ]Y� _M� `Y,� bN,*� 5� e,*� 7� e,*� '� e,*� *� e,*� @� e,*� U� e,*� -� e,*� C� e,*� 0� e,*� F	� e,*� I
� e,� i� o, s� u, s� y,� |Y s� ~� �*� -*� �  � �*� 0*� �  � �*� '*� �  � �*� **� �  � �+-� �+�� �+� ��    W   f    !  "  $  % % & / ' 9 ( D ) O * Y + d , n - y . � / � 0 � 1 � 2 � 4 � 5 � 6 � 7 � 8 � 9 � : � ; X   *    � Y Z     � � �   � � �   � � �         h     .**� 7� �� �� Q**� Q�
� �*� U*� Q� �  � �*� ��    W       >  ?  @ ( A - B X       . Y Z    �      �     J*� �*� ��� @*� �*Y� �Z`� �*� 5� �� �O*� 5�� �*Y� Qd� Q*� U*� Q� �  � ��    W       E  F & G / H 9 I I L X       J Y Z   �    � I        �     Q�L=>� +*� �.� �  L*� �.`=�*� �����**� ��l�� O*� C*� O� �  � �*� @+� ��    W   * 
   O  P  R 
 S  T   R , V 8 W H X P Y X   *    Q Y Z    N � �   L �    % �   �    � 
 �  	      �     ^�L�M>� 2*� �.�*� O�� +*� �.� �  L� ,*� �.� �  M�*� �����*� F+� �  � �*� I,� �  � ��    W   * 
   \  ]  ^  _ ' ` * a 7 ] C e P f ] g X   *    ^ Y Z    [ � �   X � �   ; �   �    �  � � 	 � �     3     *� ձ    W   
    i  j X        � �   � �     9     *� ܱ    W       4 X        Y Z      � �  � �     9     *� �    W       5 X        Y Z      � �  � �     9     *� �    W       6 X        Y Z      � �  � �     9     *� �    W       7 X        Y Z      � �   �    � �   Z  �  � � � �  � � � �  �  �            
  