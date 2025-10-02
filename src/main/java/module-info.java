module org.example.java_gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens org.example.java_gui to javafx.fxml;
    exports org.example.java_gui.A_Stages;
    exports org.example.java_gui.B_ScenesDrawing;
    exports org.example.java_gui.C_SceneBuilder;
    exports org.example.java_gui.D_EventHandling;
    exports org.example.java_gui.E_CSSStyling;
    exports org.example.java_gui.F_SwitchScenes;
    exports org.example.java_gui.G_CommunicationsBetweenControllers;
    exports org.example.java_gui.H_LogoutExitButtons;
    exports org.example.java_gui.I_ImageView;
    exports org.example.java_gui.J_TextField;
    exports org.example.java_gui.K_CheckBox;
    exports org.example.java_gui.L_RadioButtons;
    exports org.example.java_gui.M_DatePicker;
    exports org.example.java_gui.N_ColorPicker;
    exports org.example.java_gui.O_ChoiceBox;
    exports org.example.java_gui.P_Slider;
    exports org.example.java_gui.Q_ProgressBar;
    exports org.example.java_gui.R_Spinner;
    exports org.example.java_gui.S_ListView;
    exports org.example.java_gui.T_TreeView;
    exports org.example.java_gui.U_MenuBar;
    exports org.example.java_gui.V_FlowPane;
    exports org.example.java_gui.W_KeyEvent;
    exports org.example.java_gui.X_Animation;
    exports org.example.java_gui.Y_MediaView;
    exports org.example.java_gui.Z_WebView;
    exports org.example.java_gui.ZZ_Project;
}