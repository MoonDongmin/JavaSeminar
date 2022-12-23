package Chapter09.ButtonExample;

public class Button {
    OnClickListener lisner;

    void setOnClickListener(OnClickListener listener){
        this.lisner = listener;
    }

    void touch(){
        lisner.onClick();
    }

    interface OnClickListener{
        void onClick();
    }
}
