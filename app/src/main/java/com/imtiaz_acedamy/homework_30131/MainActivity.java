package com.imtiaz_acedamy.homework_30131;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.imtiaz_acedamy.homework_30131.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.tvDisplay.setText("");

        Rectangle rectangle = new Rectangle(4, 5);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(3, 4, 5);

        binding.tvDisplay.append("Rectangle - Area: " + rectangle.getArea() + ", Perimeter: " + rectangle.getPerimeter());
        binding.tvDisplay.append("\n\nCircle - Area: " + circle.getArea() + ", Perimeter: " + circle.getPerimeter());
        binding.tvDisplay.append("\n\nTriangle - Area: " + triangle.getArea() + ", Perimeter: " + triangle.getPerimeter());

    }

}