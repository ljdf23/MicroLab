package microlab.encb.com.microlab.ui.samples;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import microlab.encb.com.microlab.R;
import moe.feng.common.stepperview.IStepperAdapter;
import moe.feng.common.stepperview.VerticalStepperItemView;
import moe.feng.common.stepperview.VerticalStepperView;

/**
 * Created by Gerardo on 16/08/2017.
 */

public class SamplesFragment extends Fragment implements IStepperAdapter {
    private VerticalStepperView mVerticalStepperView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_samples, container, false);
    }



    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        mVerticalStepperView = view.findViewById(R.id.vertical_stepper_view);
        mVerticalStepperView.setStepperAdapter(this);
    }

    @Override
    public @NonNull String getTitle(int index) {
        return "Step " + index;
    }

    @Override
    public @Nullable String getSummary(int index) {
        switch (index) {
            case 0:
                return "Summarized if needed";
            case 2:
                return "Last step";
            default:
                return null;
        }
    }

    @Override
    public int size() {
        return 3;
    }

    @Override
    public View onCreateCustomView(final int index, Context context, VerticalStepperItemView parent) {
        View inflateView = LayoutInflater.from(context).inflate(R.layout.vertical_stepper_sample_item, parent, false);
        TextView contentView = inflateView.findViewById(R.id.item_content);
        contentView.setText(
                index == 0 ? R.string.content_step_0 : (index == 1 ? R.string.content_step_1 : R.string.content_step_2)
        );
        inflateView.findViewById(R.id.button_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mVerticalStepperView.nextStep()) {
                    Snackbar.make(mVerticalStepperView, "Finish", Snackbar.LENGTH_LONG).show();
                }
            }
        });
        Button prevButton = inflateView.findViewById(R.id.button_prev);
        prevButton.setText(index == 0 ? R.string.toggle_animation_button : android.R.string.cancel);
        inflateView.findViewById(R.id.button_prev).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index != 0) {
                    mVerticalStepperView.prevStep();
                } else {
                    mVerticalStepperView.setAnimationEnabled(!mVerticalStepperView.isAnimationEnabled());
                }
            }
        });
        return inflateView;
    }

    @Override
    public void onShow(int index) {

    }

    @Override
    public void onHide(int index) {

    }
}
