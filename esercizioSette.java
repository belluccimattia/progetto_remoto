����   = �  'it/edu/iisgubbio/vettori/esercizioSette  javafx/application/Application N  Ljavafx/scene/control/TextField; calcola Ljavafx/scene/control/Button; stampa Ljavafx/scene/control/Label; 	risultato stesto rtesto Ntesto i I somma numeri [I <init> ()V Code
      javafx/scene/control/TextField
  	      javafx/scene/control/Button 
  "  # (Ljava/lang/String;)V	  %   ' javafx/scene/control/Label
 & 	  * 	 
	  ,  
 . la stampa dei numeri è 
 & "	  1  
 3 il risultato è 	  5  
 7 inserisci numeri: 	  9  
 LineNumberTable LocalVariableTable this )Lit/edu/iisgubbio/vettori/esercizioSette; start (Ljavafx/stage/Stage;)V A javafx/scene/layout/GridPane
 @  D javafx/scene/Scene
 C F  G (Ljavafx/scene/Parent;)V
 @ I J K add (Ljavafx/scene/Node;II)V	 M O N javafx/geometry/Pos P Q CENTER Ljavafx/geometry/Pos;
 @ S T U setAlignment (Ljavafx/geometry/Pos;)V@$      
 @ Y Z [ setHgap (D)V
 @ ] ^ [ setVgap ` javafx/geometry/Insets
 _ b  [
 @ d e f 
setPadding (Ljavafx/geometry/Insets;)V   h i j handle F(Lit/edu/iisgubbio/vettori/esercizioSette;)Ljavafx/event/EventHandler;
  l m n setOnAction (Ljavafx/event/EventHandler;)V
 p r q javafx/stage/Stage s t setScene (Ljavafx/scene/Scene;)V v calcola la somma
 p x y # setTitle
 p { |  show finestra Ljavafx/stage/Stage; griglia Ljavafx/scene/layout/GridPane; scena Ljavafx/scene/Scene; �  
  � � � getText ()Ljava/lang/String; � ,
 � � � java/lang/String � � split '(Ljava/lang/String;)[Ljava/lang/String;	  �  
 � � � java/lang/Integer � � parseInt (Ljava/lang/String;)I  � � � makeConcatWithConstants 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
 & � � # setText  � � � (I)Ljava/lang/String; s Ljava/lang/String; num 	vetString [Ljava/lang/String; StackMapTable � main ([Ljava/lang/String;)V
  � � � launch args lambda$0 (Ljavafx/event/ActionEvent;)V
  �   e Ljavafx/event/ActionEvent; 
SourceFile esercizioSette.java BootstrapMethods
 � � � "java/lang/invoke/LambdaMetafactory � � metafactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; � (Ljavafx/event/Event;)V �
  � � � � �
 � � � $java/lang/invoke/StringConcatFactory � � �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; � � - � il risultato è  InnerClasses � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup !     
               	 
      
      
      
      
                             �     Z*� *� Y� � *� Y � !� $*� &Y� (� )*� &Y� (� +*� &Y-� /� 0*� &Y2� /� 4*� &Y6� /� 8�    :   & 	          '  2  ?  L  Y  ;       Z < =    > ?    #     �� @Y� BM� CY,� EN,*� � H,*� 8� H,*� $� H,*� )� H,*� +� H,*� 0� H,*� 4� H,� L� R, V� X, V� \,� _Y V� a� c*� $*� g  � k+-� o+u� w+� z�    :   J         "  $ % & / ' 9 ( C ) M * W , ^ - e . l / z 1 � 2 � 3 � 4 � 5 ;   *    � < =     � } ~   �  �   � � �        L     ��L=*� � �N-�� �:*��
� �6� !*� �2� �O+2� �  L�����*� 0+� �6� *� �.p� *� �.`=�*� �����*� +� �  � ��    :   B    :  ;  =  >  ?  @ $ A 3 B ? @ J E R G X H d I n G { L � M ;   H    � < =    � � �   �     | � �   t � �  ! )    U &    �    � $   � � �   	 � �     3     *� ��    :   
    P  Q ;        � �   � �     9     *� ��    :       1 ;        < =      � �   �    � �     �  � � � �  � �  � �   
  � � � 