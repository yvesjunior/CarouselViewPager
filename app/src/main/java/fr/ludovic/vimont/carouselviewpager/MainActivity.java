package fr.ludovic.vimont.carouselviewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private CarouselViewPager carousel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Entity> entities = buildData();

        carousel = (CarouselViewPager) findViewById(R.id.carousel);
        CarouselAdapter carouselAdapter = new CarouselAdapter(this, carousel, getSupportFragmentManager(), entities);
        carousel.setAdapter(carouselAdapter);
        carousel.addOnPageChangeListener(carouselAdapter);
        carousel.setOffscreenPageLimit(entities.size());
        carousel.setClipToPadding(false);
        carousel.setScrollDurationFactor(1.5f);
    }

    private ArrayList<Entity> buildData() {
        ArrayList<Entity> entities = new ArrayList<>();

        entities.add(new Entity(R.drawable.americano, "Americano", getString(R.string.americano)));
        entities.add(new Entity(R.drawable.cappucino, "Cappucino", getString(R.string.cappucino)));
        entities.add(new Entity(R.drawable.latte, "Latte", getString(R.string.latte)));
        entities.add(new Entity(R.drawable.mocha, "Mocha", getString(R.string.mocha)));
        entities.add(new Entity(R.drawable.ristretto, "Ristretto", getString(R.string.ristretto)));
        entities.add(new Entity(R.drawable.short_coffee, "Short Coffee", getString(R.string.short_coffee)));
        entities.add(new Entity(R.drawable.vienna, "Vienna", getString(R.string.vienna)));

        return entities;
    }
}
