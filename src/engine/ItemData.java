package engine;

/**
 * Represents the data for an item, including its type, sprite, tier, effect value, and duration.
 */
public class ItemData {
    /** Unique identifier for the item (e.g. "COIN", "HEAL", "SCORE"). */
    private String type;

    /** sprite type (e.g. "ItemScore", "ItemHeal"). */
    private String spriteType;

    /** rarity tier (e.g. "COMMON", "UNCOMMON", "RARE"). */
    private String dropTier;

    /** numerical value of the item effect (e.g. heal amount, score amount). */
    private int effectValue;

    /** duration that the effect remains active. */
    private int effectDuration;

    /**
     * Constructs an ItemData object.
     *
     * @param type
     *            Unique identifier for the item.
     * @param spriteType
     *            sprite type.
     * @param dropTier
     *            rarity tier.
     * @param effectValue
     *            numerical value of the item's effect.
     * @param effectDuration
     *            duration the effect remains active.
     */
    public ItemData(String type, String spriteType, String dropTier, int effectValue, int effectDuration) {
        // Unique identifier for the item (e.g "COIN", "HEAL", "SCORE").
        this.type = type;
        // The sprite type (e.g "ItemScore, ItemHeal", etc).
        this.spriteType = spriteType;
        // The rarity tier (e.g "COMMON", "UNCOMMON", "RARE").
        this.dropTier = dropTier;
        // The numerical value of the item's effect (e.g. heal amount, score amount).
        this.effectValue = effectValue;
        // The duration (in seconds or frames) that the effect remains active. 
        this.effectDuration = effectDuration;
    }

    /**
     * Getter for item type.
     *
     * @return item type.
     */
    public String getType() { return type; }

    /**
     * Getter for sprite type of the item.
     *
     * @return sprite type.
     */
    public String getSpriteType() { return spriteType; }

    /**
     * Getter for drop tier.
     *
     * @return drop tier.
     */
    public String getDropTier() { return dropTier; }

    /**
     * Getter for the numerical value of the item effect.
     *
     * @return effect value.
     */
    public int getEffectValue() { return effectValue; }

    /**
     * Getter for the duration that the effect remains active.
     *
     * @return effect duration.
     */
    public int getEffectDuration() { return effectDuration; }
}
