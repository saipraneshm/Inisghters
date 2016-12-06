package com.android.humanactivityrecognition.insighters.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.humanactivityrecognition.insighters.R;
import com.android.humanactivityrecognition.insighters.model.UserProfileInformation;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

import org.w3c.dom.Text;

/**
 * Created by sai pranesh on 05-Dec-16.
 */

public class CreateAccountDialogFragment extends DialogFragment {


    private Button mEmailSignIn;
    private TextView mCancelButton,mSubmitButton, mDialogTitle;
    private LinearLayout mUserSingUp, mUserSignIn;
    private AlertDialog.Builder builder;
    private EditText mFirstName, mLastName, mEmail, mPassword, mContact;

    public static CreateAccountDialogFragment newIntent(Context context){
        Bundle args = new Bundle();

        CreateAccountDialogFragment createAccountDialogFragment
                = new CreateAccountDialogFragment();
        createAccountDialogFragment.setArguments(args);
        return createAccountDialogFragment;
    }



    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {


        LayoutInflater inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View dialogView = inflater.inflate(R.layout.fragment_create_account_dialog,null);

        mEmailSignIn =(Button) dialogView.findViewById(R.id.email_sign_in_button);
        mCancelButton = (TextView) dialogView.findViewById(R.id.cancel_button);
        mSubmitButton = (TextView) dialogView.findViewById(R.id.submit_button);
        mDialogTitle = (TextView) dialogView.findViewById(R.id.title_dialog);
        mUserSignIn = (LinearLayout) dialogView.findViewById(R.id.sign_in_buttons_ll);
        mUserSingUp = (LinearLayout) dialogView.findViewById(R.id.sign_up_form_ll);
        mFirstName = (EditText) dialogView.findViewById(R.id.first_name_edit_text);
        mLastName = (EditText) dialogView.findViewById(R.id.last_name_edit_text);
        mEmail = (EditText) dialogView.findViewById(R.id.email_edit_text);
        mPassword = (EditText) dialogView.findViewById(R.id.password_edit_text);
        mContact = (EditText) dialogView.findViewById(R.id.contact_phone_edit_text);


        dialogView.findViewById(R.id.g_sign_in_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mEmailSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mUserSignIn.setVisibility(View.GONE);
                mDialogTitle.setText(getString(R.string.title_dialog_sign_up_form));
                mUserSingUp.setVisibility(View.VISIBLE);
                mSubmitButton.setVisibility(View.VISIBLE);
            }
        });

        mCancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDialog().dismiss();
            }
        });

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstName = mFirstName.getText().toString();
                String lastName = mLastName.getText().toString();
                String email = mEmail.getText().toString();
                String phoneNo = mContact.getText().toString();
                String password = mContact.getText().toString();

                UserProfileInformation profileInformation = new UserProfileInformation();
                profileInformation.setFirstName(firstName);
                profileInformation.setLastName(lastName);
                profileInformation.setEmail(email);
                profileInformation.setPhone(Integer.getInteger(phoneNo));


            }
        });

        builder = new AlertDialog.Builder(getActivity());
        builder.setView(dialogView);
        return builder.create();
    }



    public interface OnAccountCreation{
        void saveAccountInformation(UserProfileInformation userProfileInformation);
    }
}
