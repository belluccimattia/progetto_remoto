����   = �  it/edu/iisgubbio/vettori/media  javafx/application/Application calcola Ljavafx/scene/control/Button; 
ripristina tNumero  Ljavafx/scene/control/TextField; 	risultato Ljavafx/scene/control/Label; 	contatore media I <init> ()V Code
      javafx/scene/control/Button 
     (Ljava/lang/String;)V	     	       javafx/scene/control/TextField
  	  #  	 % javafx/scene/control/Label
 $ 	  ( 
  * 10
 $ 	  -  	  /   LineNumberTable LocalVariableTable this  Lit/edu/iisgubbio/vettori/media; start (Ljavafx/stage/Stage;)V 7 javafx/scene/layout/GridPane
 6  : javafx/scene/Scene
 9 <  = (Ljavafx/scene/Parent;)V
 6 ? @ A add (Ljavafx/scene/Node;II)V	 C E D javafx/geometry/Pos F G CENTER Ljavafx/geometry/Pos;
 6 I J K setAlignment (Ljavafx/geometry/Pos;)V@$      
 6 O P Q setHgap (D)V
 6 S T Q setVgap V javafx/geometry/Insets
 U X  Q
 6 Z [ \ 
setPadding (Ljavafx/geometry/Insets;)V   ^ _ ` handle =(Lit/edu/iisgubbio/vettori/media;)Ljavafx/event/EventHandler;
  b c d setOnAction (Ljavafx/event/EventHandler;)V  ^
 g i h javafx/stage/Stage j k setScene (Ljavafx/scene/Scene;)V m calcola la media di 10 numeri
 g o p  setTitle
 g r s  show finestra Ljavafx/stage/Stage; griglia Ljavafx/scene/layout/GridPane; scena Ljavafx/scene/Scene; {  
  } ~  setText
 $ }
 $ � � � getText ()Ljava/lang/String;
 � � � java/lang/Integer � � parseInt (Ljava/lang/String;)I
  �  � � � makeConcatWithConstants (I)Ljava/lang/String;  � conta numero StackMapTable main ([Ljava/lang/String;)V
  � � � launch args [Ljava/lang/String; lambda$0 (Ljavafx/event/ActionEvent;)V
  �   e Ljavafx/event/ActionEvent; lambda$1
  �   
SourceFile 
media.java BootstrapMethods
 � � � "java/lang/invoke/LambdaMetafactory � � metafactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; � (Ljavafx/event/Event;)V �
  � � � � � �
  � � � � �
 � � � $java/lang/invoke/StringConcatFactory � � �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; � �  InnerClasses � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup !                     	     
                        �     G*� *� Y� � *� Y� � *� Y� !� "*� $Y� &� '*� $Y)� +� ,*� .�    0   "           )  4  A  F  1       G 2 3    4 5         �� 6Y� 8M� 9Y,� ;N,*� "� >,*� ,� >,*� � >,*� � >,*� '� >,� B� H, L� N, L� R,� UY L� W� Y*� *� ]  � a*� *� e  � a+-� f+l� n+� q�    0   F           %  /  9  C  J   Q ! X " f $ s % � ' � ( � ) � * 1   *    � 2 3     � t u   � v w    x y         [     !*� .*� "z� |*� ,)� *� 'z� �    0       ,  -  .  /   1 1       ! 2 3          �     ^*� ,� �� �<*� "� �� �=� *Y� .`� .� *Y� .
l� .*� '*� .� �  � ��*� ,� �  � *� "z� |�    0   .    3  4  6  7 $ : ) ; 4 < D ? G @ T A ] B 1        ^ 2 3    S �    H �   �    � $ 	 � �     3     *� ��    0   
    D  E 1        � �   � �     9     *� ��    0       $ 1        2 3      � �  � �     9     *� ��    0       % 1        2 3      � �   �    � �   "  �  � � � �  � � � �  � �  � �   
  � � � 