����   =  %it/edu/iisgubbio/vettori/esercizioDue  javafx/application/Application N  Ljavafx/scene/control/TextField; M riempi Ljavafx/scene/control/Button; calcola stampa Ljavafx/scene/control/Label; 	risultato stesto rtesto Ntesto Mtesto i I somma numeri [I 
operazione Ljavafx/scene/control/ComboBox; 	Signature 3Ljavafx/scene/control/ComboBox<Ljava/lang/String;>; <init> ()V Code
     ! javafx/scene/control/TextField
   	  $  	  &   ( javafx/scene/control/Button 
 ' +  , (Ljava/lang/String;)V	  .  	 
	  1 
 	 3 javafx/scene/control/Label
 2 	  6  	  8   : la stampa dei numeri è 
 2 +	  =   ? il risultato è 	  A   C inserisci numro: 	  E   G inserisci i numeri max: 	  I   K javafx/scene/control/ComboBox
 J 	  N   LineNumberTable LocalVariableTable this 'Lit/edu/iisgubbio/vettori/esercizioDue; start (Ljavafx/stage/Stage;)V V javafx/scene/layout/GridPane
 U  Y javafx/scene/Scene
 X [  \ (Ljavafx/scene/Parent;)V
 U ^ _ ` add (Ljavafx/scene/Node;II)V
 J b c d getItems %()Ljavafx/collections/ObservableList; f + h j i !javafx/collections/ObservableList _ k (Ljava/lang/Object;)Z m - o x
 J q r s getSelectionModel -()Ljavafx/scene/control/SingleSelectionModel;
 u w v )javafx/scene/control/SingleSelectionModel x y select (I)V	 { } | javafx/geometry/Pos ~  CENTER Ljavafx/geometry/Pos;
 U � � � setAlignment (Ljavafx/geometry/Pos;)V@$      
 U � � � setHgap (D)V
 U � � � setVgap � javafx/geometry/Insets
 � �  �
 U � � � 
setPadding (Ljavafx/geometry/Insets;)V   � � � handle D(Lit/edu/iisgubbio/vettori/esercizioDue;)Ljavafx/event/EventHandler;
 ' � � � setOnAction (Ljavafx/event/EventHandler;)V  �
 � � � javafx/stage/Stage � � setScene (Ljavafx/scene/Scene;)V � calcola la somma
 � � � , setTitle
 � � �  show finestra Ljavafx/stage/Stage; griglia Ljavafx/scene/layout/GridPane; scena Ljavafx/scene/Scene;
   � � � getText ()Ljava/lang/String;
 � � � java/lang/Integer � � parseInt (Ljava/lang/String;)I	  �  
 � � � java/lang/Math � � random ()D n max StackMapTable �    � � � makeConcatWithConstants '(Ljava/lang/String;I)Ljava/lang/String;
 J � � � getValue ()Ljava/lang/Object; � java/lang/String
 � � � k equals  � � � (I)Ljava/lang/String;
 2 � � , setText  �  � s Ljava/lang/String; op prodotto 
differenza main ([Ljava/lang/String;)V
  � � � launch args [Ljava/lang/String; lambda$0 (Ljavafx/event/ActionEvent;)V
  �   e Ljavafx/event/ActionEvent; lambda$1
  � 
  
SourceFile esercizioDue.java BootstrapMethods
 � � � "java/lang/invoke/LambdaMetafactory � � metafactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; � (Ljavafx/event/Event;)V �
   � � � � �
  � � �
	
 $java/lang/invoke/StringConcatFactory � �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; -  InnerClasses %java/lang/invoke/MethodHandles$Lookup java/lang/invoke/MethodHandles Lookup !                     	     
 	                                                                           �     �*� *�  Y� "� #*�  Y� "� %*� 'Y)� *� -*� 'Y/� *� 0*� 2Y� 4� 5*� 2Y� 4� 7*� 2Y9� ;� <*� 2Y>� ;� @*� 2YB� ;� D*� 2YF� ;� H*� JY� L� M�    O   6           '  4  ?  J  W  d  q  ~  �  P       � Q R    S T    �    � UY� WM� XY,� ZN,*� #� ],*� %� ],*� M� ],*� D� ],*� H� ],*� -� ],*� 0� ],*� 5� ],*� 7� ],*� <� ],*� @� ]*� M� ae� g W*� M� al� g W*� M� an� g W*� M� p� t,� z� �, �� �, �� �,� �Y �� �� �*� -*� �  � �*� 0*� �  � �+-� �+�� �+� ��    O   n    !  "  $  % % & / ' 9 ( C ) M * W + a , k - u .  / � 0 � 1 � 3 � 5 � 6 � 7 � 8 � 9 � : � ; � < � = > P   *    Q R     � �   � � �   � � �         �     B<*� #� �� �<*�
� �=*� %� �� �=>� *� �� ��k�`O�*� �����    O   & 	   @  A  B  C  D ! E & F 5 E A H P   *    B Q R    @ �    , �   #     �   	 � &  
     �     ��L=� +*� �.� �  L�*� ������M*� M� �� �M>66,e� ә -6� *� �.`>�*� �����*� 7� �  � �,l� ә 06� *� �.d6�*� �����*� 7� �  � �,n� ә 06� *� �.h6�*� �����*� 7� �  � �*� <+� ٱ    O   j    J  K  L  K ! N $ O / P 1 Q 4 R 7 S @ T F U P T ] W j Y s Z y [ � Z � ] � _ � ` � a � ` � c � e � g P   f 
   � Q R    � � �       $ � � �  1 �    4 � �   7 � �   C     v     �     �   2 �  �� -   � �  � � � � �  	 � �     3     *� �    O   
    j  k P        � �   � �     9     *� �    O       9 P        Q R      � �  � �     9     *� �    O       : P        Q R      � �   �    � �   .  �  � �        
  