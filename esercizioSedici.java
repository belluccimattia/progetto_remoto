Êþº¾   = ¹  (it/edu/iisgubbio/vettori/esercizioSedici  javafx/application/Application tNumeri  Ljavafx/scene/control/TextField; tK lRis Ljavafx/scene/control/Label; vettore [I <init> ()V Code
      javafx/scene/control/TextField
  	    	      javafx/scene/control/Label  	risultato
     (Ljava/lang/String;)V	     	 LineNumberTable LocalVariableTable this *Lit/edu/iisgubbio/vettori/esercizioSedici; start (Ljavafx/stage/Stage;)V ( javafx/scene/control/Button * Soluzione facile
 '  - numeri separati da ','  / K 1 javafx/scene/layout/GridPane
 0 
 0 4 5 6 add (Ljavafx/scene/Node;II)V 8 javafx/geometry/Insets@4      
 7 <  = (D)V
 0 ? @ A 
setPadding (Ljavafx/geometry/Insets;)V
 0 C D = setHgap
 0 F G = setVgap I javafx/scene/Scene@@     @rÀ     
 H O  P (Ljavafx/scene/Parent;DD)V
 R T S javafx/stage/Stage U V setScene (Ljavafx/scene/Scene;)V X numeri maggiori di K
 R Z [  setTitle
 R ] ^  show   ` a b handle G(Lit/edu/iisgubbio/vettori/esercizioSedici;)Ljavafx/event/EventHandler;
 ' d e f setOnAction (Ljavafx/event/EventHandler;)V finestra Ljavafx/stage/Stage; pCalcola Ljavafx/scene/control/Button; lVett lK griglia Ljavafx/scene/layout/GridPane; scena Ljavafx/scene/Scene; calcola
  s t u getText ()Ljava/lang/String;
 w y x java/lang/Integer z { parseInt (Ljava/lang/String;)I } ,
    java/lang/String   split '(Ljava/lang/String;)[Ljava/lang/String;	   
   si
     setText  no s [Ljava/lang/String; testo Ljava/lang/String; k I 	contatore i StackMapTable  main ([Ljava/lang/String;)V
     launch args lambda$0 (Ljavafx/event/ActionEvent;)V
    q  e Ljavafx/event/ActionEvent; 
SourceFile esercizioSedici.java BootstrapMethods
 § © ¨ "java/lang/invoke/LambdaMetafactory ª « metafactory Ì(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; ¦ (Ljavafx/event/Event;)V ­
  °   ¯  InnerClasses µ %java/lang/invoke/MethodHandles$Lookup · java/lang/invoke/MethodHandles Lookup !                     	     
            b     (*· *» Y· µ *» Y· µ *» Y· µ ±    !              '  "       ( # $    % &    [     ­» 'Y)· +M» Y,· N» Y.· :» 0Y· 2:*´ ¶ 3-¶ 3*´ ¶ 3¶ 3,¶ 3*´ ¶ 3» 7Y 9· ;¶ > 9¶ B 9¶ E» HY J L· N:+¶ Q+W¶ Y+¶ \,*º _  ¶ c±    !   N     
      (  3  ;  F  O  W  b  q  y    !  "  #  $ ¢ % ¬ ' "   H    ­ # $     ­ g h  
 £ i j    k 	    l 	  (  m n    o p   q     5     w*´ ¶ r¸ v>*´ ¶ rM,|¶ ~L6*+¾¼
µ 6§ *´ +2¸ vO+¾¡ÿë6§ &*´ .¤ *´ ¶ § *´ ¶ *´ ¾¡ÿÖ±    !   >    -  .  /  0  1 % 3 + 4 9 3 C 7 I 8 T 9 ] : ` ; i 7 v B "   H    w # $    ]     d     l     Z    (     F 0        ÿ +       	       3     *¸ ±    !   
    E  F "                  9     *¶ ±    !       % "        # $      ¡ ¢   £    ¤ ¥     ¬  ® ± ² ³   
  ´ ¶ ¸ 