package sg.edu.rp.c346.id22025566.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    // declare variables
    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;


    // method to calculate pay based on the price and discount.
    private double calcPay(double price, double discount) {
        double pay=price*(1-discount/100);
        return pay;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // bind to UI elements in activity_main.xml
        cbEnabled=findViewById(R.id.checkBoxDiscount);
        btnCheck=findViewById(R.id.buttonCheck);
        tvShow=findViewById(R.id.textView);





        // button to check if discount button was clicked.
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.i("MyActivity", "Inside onClick()");
                Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_LONG).show();

                boolean isChecked = cbEnabled.isChecked(); // check the state of checkbox cbEnabled.

                if (isChecked) {
                    double pay=calcPay(100, 20); // calc pay based on parameters price and discount. call the method calcPay.
                    tvShow.setText("The discount is given. You need to pay $" + pay);
                }
                else {
                    double pay=calcPay(100, 0);
                    tvShow.setText("The discount is not given. You need to pay $" + pay);
                }




            }
        });

    }
}