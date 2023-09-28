package com.faye.jupiter.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.faye.jupiter.entity.db.Item;

public class FavoriteRequestBody {

    @JsonProperty("favorite")
    private Item favoriteItem;

    public Item getFavoriteItem() {
        return favoriteItem;
    }
}
