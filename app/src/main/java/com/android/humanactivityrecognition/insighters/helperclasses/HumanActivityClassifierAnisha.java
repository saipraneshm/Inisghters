package com.android.humanactivityrecognition.insighters.helperclasses;

import android.util.Log;

import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;

/**
 * Created by sai pranesh on 02-Dec-16.
 */

public class HumanActivityClassifierAnisha {

    //private Instances isTrainingSet;

    public String initialize(Double x, Double y, Double z, WekaWrapper wekaWrapper) {

        //Adding Possible Class Values
        FastVector fvClassVal = new FastVector(4);
        fvClassVal.addElement("sit");
        fvClassVal.addElement("walk");
        fvClassVal.addElement("fall");

        //Adding Attributes
        Attribute Attribute1 = new Attribute("x");
        Attribute Attribute2 = new Attribute("y");
        Attribute Attribute3 = new Attribute("z");
        Attribute ClassAttribute = new Attribute("gt", fvClassVal);

        //Creating Vector consisting of all attributes of a sample set
        FastVector fvWekaAttributes = new FastVector(4);
        fvWekaAttributes.addElement(Attribute1);
        fvWekaAttributes.addElement(Attribute2);
        fvWekaAttributes.addElement(Attribute3);
        fvWekaAttributes.addElement(ClassAttribute);

        //Creating Instances with size as 10
        Instances isTrainingSet = new Instances("Rel", fvWekaAttributes, 10);
        //Telling the model that ClassAttributes is the class value.
        isTrainingSet.setClassIndex(3);

        //Creating an instance that needs to be classified
        Instance iExample = new DenseInstance(4);

        //Adding x,y and z values
        iExample.setValue((Attribute)fvWekaAttributes.elementAt(0), x);
        iExample.setValue((Attribute)fvWekaAttributes.elementAt(1), y);
        iExample.setValue((Attribute)fvWekaAttributes.elementAt(2), z);


        // add the instance
        isTrainingSet.add(iExample);


        try {
            double result = 0.0;
            //Storing the result of the classified instance in a double value
            if(isTrainingSet.firstInstance() != null)
                result = wekaWrapper.classifyInstance(isTrainingSet.instance(0));

            //Returning the value as string.
            Log.d("RESULT", isTrainingSet.instance(0).classAttribute().value((int)result));
            return isTrainingSet.instance(0).classAttribute().value((int)result);
        } catch (Exception e) {
            e.printStackTrace();
            return "exception";
        }

    }//end initialize
}
