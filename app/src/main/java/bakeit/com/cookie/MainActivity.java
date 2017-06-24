package bakeit.com.cookie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    View frame1;
    Button frame1Next;
    Button frame1Prev;
    View frame2;
    Button frame2Next;
    Button frame2Prev;
    View frame3;
    Button frame3Next;
    Button frame3Prev;
    View frame4;
    Button frame4Next;
    Button frame4Prev;
    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frame1 = findViewById(R.id.frame1);
        frame2 = findViewById(R.id.frame2);
        frame3 = findViewById(R.id.frame3);
        frame4 = findViewById(R.id.frame4);

        frame1Next = (Button) findViewById(R.id.frame1Next);
        frame2Next = (Button) findViewById(R.id.frame2Next);
        frame3Next = (Button) findViewById(R.id.frame3Next);
        frame4Next = (Button) findViewById(R.id.frame4Next);

        frame1Prev = (Button) findViewById(R.id.frame1Prev);
        frame2Prev = (Button) findViewById(R.id.frame2Prev);
        frame3Prev = (Button) findViewById(R.id.frame3Prev);
        frame4Prev = (Button) findViewById(R.id.frame4Prev);

        startButton = (Button) findViewById(R.id.begin);
    }


    public void setFrameVisible(View view, Button next, Button prev) {
        view.setVisibility(View.VISIBLE);
        next.setVisibility(View.VISIBLE);
        prev.setVisibility(View.VISIBLE);
    }

    public void setFrameInvisible(View view, Button next, Button prev) {
        view.setVisibility(View.INVISIBLE);
        next.setVisibility(View.INVISIBLE);
        prev.setVisibility(View.INVISIBLE);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.begin) {
            setFrameVisible(frame1, frame1Next, frame1Prev);
            startButton.setVisibility(View.INVISIBLE);
        } else if (id == R.id.frame1Prev) {
            startButton.setVisibility(View.VISIBLE);
            setFrameInvisible(frame1, frame1Next, frame1Prev);
        } else if (id == R.id.frame1Next) {
            setFrameVisible(frame2, frame2Next, frame2Prev);
            setFrameInvisible(frame1, frame1Next, frame1Prev);
        } else if (id == R.id.frame2Prev) {
            setFrameVisible(frame1, frame1Next, frame1Prev);
            setFrameInvisible(frame2, frame2Next, frame2Prev);
        } else if (id == R.id.frame2Next) {
            setFrameVisible(frame3, frame3Next, frame3Prev);
            setFrameInvisible(frame2, frame2Next, frame2Prev);
        } else if (id == R.id.frame3Prev) {
            setFrameVisible(frame2, frame2Next, frame2Prev);
            setFrameInvisible(frame3, frame3Next, frame3Prev);
        } else if (id == R.id.frame3Next) {
            setFrameVisible(frame4, frame4Next, frame4Prev);
            setFrameInvisible(frame3, frame3Next, frame3Prev);
        } else if (id == R.id.frame4Prev) {
            setFrameVisible(frame3, frame3Next, frame3Prev);
            setFrameInvisible(frame4, frame4Next, frame4Prev);
        }
    }
}