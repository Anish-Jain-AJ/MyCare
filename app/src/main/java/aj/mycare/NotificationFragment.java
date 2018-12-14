package aj.mycare;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationFragment extends Fragment {


    public NotificationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notification, container, false);

        Button fitone = (Button)view.findViewById(R.id.fitone_button);
        fitone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentOne = new Intent(getActivity(),FitnessOne.class);
                startActivity(intentOne);
            }
        });

        Button fittwo = (Button)view.findViewById(R.id.fittwo_button);
        fittwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTwo = new Intent(getActivity(),FitnessTwo.class);
                startActivity(intentTwo);
            }
        });

        Button fitthree = (Button)view.findViewById(R.id.fitthree_button);
        fitthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentThree = new Intent(getActivity(),FitnessThree.class);
                startActivity(intentThree);
            }
        });

        Button fitfour = (Button)view.findViewById(R.id.fitfour_button);
        fitfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFour = new Intent(getActivity(),FitnessFour.class);
                startActivity(intentFour);
            }
        });
        return view;
    }

}
