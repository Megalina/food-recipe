package com.example.foodrecipee;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recipeRecyclerView;
    List<Recipe> recipeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipeRecyclerView = findViewById(R.id.recipeRecyclerView);
        recipeList = new ArrayList<>();

        // Sample recipes
        recipeList.add(new Recipe("Pasta", "tomato sauce style",
                "Pasta(spaghetti, macaroni, etc..), Vegetable oil, Onion(chopped), Fresh tomatoes, tomato paste(optional), Seasonings, Salt and Peepper, Water",
                "1. Boil the pasta:\n" +
                        "\n" +
                        "In a pot, boil water with a pinch of salt.\n" +
                        "\n" +
                        "Add pasta and cook until soft (about 8–10 mins).\n" +
                        "\n" +
                        "Drain and set aside.\n" +
                        "\n2. Make the sauce:\n" +
                        "\n" +
                        "Heat oil in a pan, sauté onions.\n" +
                        "\n" +
                        "Add blended or chopped tomatoes and tomato paste.\n" +
                        "\n" +
                        "Cook until it thickens and the oil separates.\n" +
                        "\n" +
                        "Add seasonings , salt, and pepper. Stir well.\n" +
                        "\n3. Mix pasta and sauce:\n" +
                        "\n" +
                        "Add the boiled pasta into the sauce.\n" +
                        "\n" +
                        "Stir to combine and let it cook together for 3–5 minutes.\n" +
                        "Serve hot with boiled egg, fried plantain, or meat on the side."));

        recipeList.add(new Recipe("Fruit Salad", "Refreshing mix of fruits",
                "Chicken (cut into parts), Scotch bonnet peppers, Red bell peppers, Onion, Seasoning, Thyme, Curry powder, Salt, Garlic or ginger (optional), Vegetable oil, ",
                "1. Chop fruits\n2. Mix in a bowl\n3. Add honey & serve"));
        recipeList.add(new Recipe("Peppered chicken", "Tasty peppered chicken",
                "Apple, Banana, Orange, Grapes",
                "1. Boil the Chicken: i. Season chicken with salt, seasonings, thyme, curry, and garlic/ginger.\n" +
                        "ii. Add chopped onions \n" +
                        "iii. Boil until cooked and tender. Then fry or grill the chicken (optional for extra crispiness).\n" +
                        "\n2. Make the Pepper Sauce: i. Blend scotch bonnets, bell peppers, and onion (not too smooth).\n" +
                        "ii. Heat oil in a pan, pour in the pepper mix.\n" +
                        "iii. Fry until the oil begins to separate and the sauce thickens.\n" +
                        "\n3. Combine: i. Add the fried/grilled chicken into the pepper sauce.\n" +
                        "ii. Stir well to coat, and let it simmer for 5–10 minutes.\n" +
                        "iii. Serve with: rice, fried plantains, yam, or enjoy as a spicy snack!"));
        recipeList.add(new Recipe("Jollof rice", "Tasty jollof",
                "Rice, Vegetable oil, Onion(chopped), Tomatoes(blended), Red bell pepper(blended), Scotch bonnet peppers, Tomato paste, Thyme, Curry powder, Seasonings, Salt, Chicken stock(or water)",
                "1. Prepare the rice: Rinse the rice with cold water 2-3 times to remove excess starch. Set aside.\n" +
                        "2. Make the sauce: Heat oil in a pot, sauté onions until soft. Add tomato paste and fry for 2-3 minutes. Then add the blended tomato/pepper mixture. Let it cook for 10-15 minutes, stirring occasionally, until it reduces and the oil starts to separate.\n" +
                        "3. Season: Add thyme, curry, seasonings, and salt. Stir well.\n" +
                        "4. Add rice: Pour in the rinsed rice and stir to coat with the sauce.\n" +
                        "5. Add liquid: Pour in chicken stock or water just enough to cover the rice. Add a bay leaf if using. Cover with foil or a tight-fitting lid.\n" +
                        "6. Cook: Lower the heat and let it simmer for 25-30 minutes. Check and stir occasionally to prevent burning. If it’s too dry, add a bit more water."));
        recipeList.add(new Recipe("Pounded yam", "instant pounded yam",
                "Yam, Water",
                "1. Peel and cut yam into chunks\n" +
                        "2. Rinse\n" +
                        "3. Boil in water until soft(a fork should go through easily) \n" +
                        "4. Pound using a mortar and pestle until smooth and strechy \n" +
                        "5. Mold into balls and serve hot"));
        recipeList.add(new Recipe("Vegetable Soup", "Sweet vegetables",
                "1 bunch of ugu (fluted pumpkin) or spinach, washed and chopped, 1 cup palm oil, 1 medium onion (chopped), 2–3 seasoning cubes (Maggi or Knorr), Salt to taste, 1 tablespoon ground crayfish (optional), 1-2 cups assorted meat/fish (beef, pomo, stockfish, dried fish, etc.), Ground pepper or fresh pepper , 1 cup stock or water, ",
                "1. Cook meat/fish with seasoning cubes, salt, and onion until soft. Set aside with the stock.\n" +
                        "2. Heat palm oil in a pot, add chopped onions, and stir for 1–2 minutes.\n" +
                        "3. Add crayfish and pepper. Stir for 2 minutes.\n" +
                        "4. Add the cooked meat/fish and the stock. Let it simmer for 3–5 minutes.\n" +
                        "5. Add the chopped vegetables. Stir well and cook for just 3–5 minutes (to keep it fresh and green).\n" +
                        "6. Taste and adjust seasoning if needed.\n" +
                        "Serve with: eba, pounded yam, rice, or fufu!"));
        recipeRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        recipeRecyclerView.setAdapter(new RecipeAdapter(recipeList, this));
    }
}
