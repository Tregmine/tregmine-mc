// Generated by delegate_gen on Mon Jan 13 09:30:38 CET 2014
package info.tregmine.api;

import info.tregmine.Tregmine;
import net.md_5.bungee.api.chat.BaseComponent;
import net.minecraft.server.EntityPlayer;
import org.bukkit.BanList.Type;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.craftbukkit.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.entity.Player.Spigot;

public abstract class PlayerDelegate implements GenericDelegate {
    private org.bukkit.entity.Player delegate;

    protected PlayerDelegate(org.bukkit.entity.Player d) {
        this.delegate = d;
    }

    @Override
    public void abandonConversation(org.bukkit.conversations.Conversation p0) {
        checkState();
        delegate.abandonConversation(p0);
    }

    @Override
    public void abandonConversation(org.bukkit.conversations.Conversation p0,
                                    org.bukkit.conversations.ConversationAbandonedEvent p1) {
        checkState();
        delegate.abandonConversation(p0, p1);
    }

    @Override
    public void acceptConversationInput(java.lang.String p0) {
        checkState();
        delegate.acceptConversationInput(p0);
    }

    @Override
    public org.bukkit.permissions.PermissionAttachment addAttachment(org.bukkit.plugin.Plugin p0) {
        checkState();
        return delegate.addAttachment(p0);
    }

    @Override
    public org.bukkit.permissions.PermissionAttachment addAttachment(org.bukkit.plugin.Plugin p0, int p1) {
        checkState();
        return delegate.addAttachment(p0, p1);
    }

    @Override
    public org.bukkit.permissions.PermissionAttachment addAttachment(org.bukkit.plugin.Plugin p0, java.lang.String p1,
                                                                     boolean p2) {
        checkState();
        return delegate.addAttachment(p0, p1, p2);
    }

    @Override
    public org.bukkit.permissions.PermissionAttachment addAttachment(org.bukkit.plugin.Plugin p0, java.lang.String p1,
                                                                     boolean p2, int p3) {
        checkState();
        return delegate.addAttachment(p0, p1, p2, p3);
    }

    @Override
    public boolean addPotionEffect(org.bukkit.potion.PotionEffect p0) {
        checkState();
        return delegate.addPotionEffect(p0);
    }

    @Override
    public boolean addPotionEffect(org.bukkit.potion.PotionEffect p0, boolean p1) {
        checkState();
        return delegate.addPotionEffect(p0, p1);
    }

    @Override
    public boolean addPotionEffects(java.util.Collection<org.bukkit.potion.PotionEffect> p0) {
        checkState();
        return delegate.addPotionEffects(p0);
    }

    @Override
    public void awardAchievement(org.bukkit.Achievement p0) {
        checkState();
        delegate.awardAchievement(p0);
    }

    @Override
    public boolean beginConversation(org.bukkit.conversations.Conversation p0) {
        checkState();
        return delegate.beginConversation(p0);
    }

    @Override
    public boolean canSee(org.bukkit.entity.Player p0) {
        checkState();
        return delegate.canSee(p0);
    }

    @Override
    public void chat(java.lang.String p0) {
        checkState();
        delegate.chat(p0);
    }

    private void checkState() {
        if (delegate == null) {
            throw new IllegalStateException("Can't be used when delegate isn't set.");
        }
    }

    @Override
    public void closeInventory() {
        checkState();
        delegate.closeInventory();
    }

    @Override
    public CraftPlayer craftPlayer() {
        checkState();
        return (CraftPlayer) delegate;
    }

    @Override
    public void damage(double p0) {
        checkState();
        delegate.damage(p0);
    }

    @Override
    public void damage(double p0, org.bukkit.entity.Entity p1) {
        checkState();
        delegate.damage(p0, p1);
    }

    @Override
    public boolean eject() {
        checkState();
        return delegate.eject();
    }

    @Override
    public java.util.Collection<org.bukkit.potion.PotionEffect> getActivePotionEffects() {
        checkState();
        return delegate.getActivePotionEffects();
    }

    @Override
    public java.net.InetSocketAddress getAddress() {
        checkState();
        return delegate.getAddress();
    }

    @Override
    public boolean getAllowFlight() {
        checkState();
        return delegate.getAllowFlight();
    }

    @Override
    public void setAllowFlight(boolean p0) {
        checkState();
        delegate.setAllowFlight(p0);
    }

    @Override
    public org.bukkit.Location getBedSpawnLocation() {
        checkState();
        return delegate.getBedSpawnLocation();
    }

    @Override
    public void setBedSpawnLocation(org.bukkit.Location p0) {
        checkState();
        delegate.setBedSpawnLocation(p0);
    }

    @Override
    public boolean getCanPickupItems() {
        checkState();
        return delegate.getCanPickupItems();
    }

    @Override
    public void setCanPickupItems(boolean p0) {
        checkState();
        delegate.setCanPickupItems(p0);
    }

    @Override
    public org.bukkit.Location getCompassTarget() {
        checkState();
        return delegate.getCompassTarget();
    }

    @Override
    public void setCompassTarget(org.bukkit.Location p0) {
        checkState();
        delegate.setCompassTarget(p0);
    }

    @Override
    public java.lang.String getCustomName() {
        checkState();
        return delegate.getCustomName();
    }

    @Override
    public void setCustomName(java.lang.String p0) {
        checkState();
        delegate.setCustomName(p0);
    }

    @Override
    public org.bukkit.entity.Player getDelegate() {
        return delegate;
    }

    @Override
    public void setDelegate(org.bukkit.entity.Player v) {
        this.delegate = v;
    }

    @Override
    public java.lang.String getDisplayName() {
        checkState();
        return delegate.getDisplayName();
    }

    @Override
    public void setDisplayName(java.lang.String p0) {
        checkState();
        delegate.setDisplayName(p0);
    }

    @Override
    public java.util.Set<org.bukkit.permissions.PermissionAttachmentInfo> getEffectivePermissions() {
        checkState();
        return delegate.getEffectivePermissions();
    }

    @Override
    public org.bukkit.inventory.Inventory getEnderChest() {
        checkState();
        return delegate.getEnderChest();
    }

    @Override
    public int getEntityId() {
        checkState();
        return delegate.getEntityId();
    }

    @Override
    public org.bukkit.inventory.EntityEquipment getEquipment() {
        checkState();
        return delegate.getEquipment();
    }

    @Override
    public float getExhaustion() {
        checkState();
        return delegate.getExhaustion();
    }

    @Override
    public void setExhaustion(float p0) {
        checkState();
        delegate.setExhaustion(p0);
    }

    @Override
    public float getExp() {
        checkState();
        return delegate.getExp();
    }

    @Override
    public void setExp(float p0) {
        checkState();
        delegate.setExp(p0);
    }

    @Override
    public int getExpToLevel() {
        checkState();
        return delegate.getExpToLevel();
    }

    @Override
    public double getEyeHeight() {
        checkState();
        return delegate.getEyeHeight();
    }

    @Override
    public double getEyeHeight(boolean p0) {
        checkState();
        return delegate.getEyeHeight(p0);
    }

    @Override
    public org.bukkit.Location getEyeLocation() {
        checkState();
        return delegate.getEyeLocation();
    }

    @Override
    public float getFallDistance() {
        checkState();
        return delegate.getFallDistance();
    }

    @Override
    public void setFallDistance(float p0) {
        checkState();
        delegate.setFallDistance(p0);
    }

    @Override
    public int getFireTicks() {
        checkState();
        return delegate.getFireTicks();
    }

    @Override
    public void setFireTicks(int p0) {
        checkState();
        delegate.setFireTicks(p0);
    }

    @Override
    public long getFirstPlayed() {
        checkState();
        return delegate.getFirstPlayed();
    }

    @Override
    public float getFlySpeed() {
        checkState();
        return delegate.getFlySpeed();
    }

    @Override
    public void setFlySpeed(float p0) {
        checkState();
        delegate.setFlySpeed(p0);
    }

    @Override
    public int getFoodLevel() {
        checkState();
        return delegate.getFoodLevel();
    }

    @Override
    public void setFoodLevel(int p0) {
        checkState();
        delegate.setFoodLevel(p0);
    }

    @Override
    public org.bukkit.GameMode getGameMode() {
        checkState();
        return delegate.getGameMode();
    }

    @Override
    public void setGameMode(org.bukkit.GameMode p0) {
        checkState();
        delegate.setGameMode(p0);
    }

    @Override
    public EntityPlayer getHandle() {
        checkState();
        return craftPlayer().getHandle();
    }

    @Override
    public double getHealth() {
        checkState();
        return delegate.getHealth();
    }

    @Override
    public void setHealth(double p0) {
        checkState();
        delegate.setHealth(p0);
    }

    @Override
    public double getHealthScale() {
        checkState();
        return delegate.getHealthScale();
    }

    @Override
    public void setHealthScale(double p0) {
        checkState();
        delegate.setHealthScale(p0);
    }

    @Override
    public org.bukkit.inventory.PlayerInventory getInventory() {
        checkState();
        return delegate.getInventory();
    }

    @Override
    public org.bukkit.inventory.ItemStack getItemInHand() {
        checkState();
        return delegate.getEquipment().getItemInMainHand();
    }

    @Override
    public void setItemInHand(org.bukkit.inventory.ItemStack p0) {
        checkState();
        delegate.setItemOnCursor(p0);
    }

    @Override
    public org.bukkit.inventory.ItemStack getItemOnCursor() {
        checkState();
        return delegate.getItemOnCursor();
    }

    @Override
    public void setItemOnCursor(org.bukkit.inventory.ItemStack p0) {
        checkState();
        delegate.setItemOnCursor(p0);
    }

    @Override
    public org.bukkit.entity.Player getKiller() {
        checkState();
        return delegate.getKiller();
    }

    @Override
    public double getLastDamage() {
        checkState();
        return delegate.getLastDamage();
    }

    @Override
    public void setLastDamage(double p0) {
        checkState();
        delegate.setLastDamage(p0);
    }

    @Override
    public org.bukkit.event.entity.EntityDamageEvent getLastDamageCause() {
        checkState();
        return delegate.getLastDamageCause();
    }

    @Override
    public void setLastDamageCause(org.bukkit.event.entity.EntityDamageEvent p0) {
        checkState();
        delegate.setLastDamageCause(p0);
    }

    @Override
    public long getLastPlayed() {
        checkState();
        return delegate.getLastPlayed();
    }

    @Override
    public org.bukkit.entity.Entity getLeashHolder() {
        checkState();
        return delegate.getLeashHolder();
    }

    @Override
    public int getLevel() {
        checkState();
        return delegate.getLevel();
    }

    @Override
    public void setLevel(int p0) {
        checkState();
        delegate.setLevel(p0);
    }

    @Override
    public java.util.Set<java.lang.String> getListeningPluginChannels() {
        checkState();
        return delegate.getListeningPluginChannels();
    }

    @Override
    public org.bukkit.Location getLocation() {
        checkState();
        return delegate.getLocation();
    }

    @Override
    public org.bukkit.Location getLocation(org.bukkit.Location p0) {
        checkState();
        return delegate.getLocation(p0);
    }

    @Override
    public int getMaxFireTicks() {
        checkState();
        return delegate.getMaxFireTicks();
    }

    @Override
    public double getMaxHealth() {
        checkState();
        return delegate.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
    }

    @Override
    public void setMaxHealth(double p0) {
        checkState();
        delegate.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(p0);
    }

    @Override
    public int getMaximumAir() {
        checkState();
        return delegate.getMaximumAir();
    }

    @Override
    public void setMaximumAir(int p0) {
        checkState();
        delegate.setMaximumAir(p0);
    }

    @Override
    public int getMaximumNoDamageTicks() {
        checkState();
        return delegate.getMaximumNoDamageTicks();
    }

    @Override
    public void setMaximumNoDamageTicks(int p0) {
        checkState();
        delegate.setMaximumNoDamageTicks(p0);
    }

    @Override
    public java.util.List<org.bukkit.metadata.MetadataValue> getMetadata(java.lang.String p0) {
        checkState();
        return delegate.getMetadata(p0);
    }

    @Override
    public java.lang.String getName() {
        checkState();
        return delegate.getName();
    }

    @Override
    public java.util.List<org.bukkit.entity.Entity> getNearbyEntities(double p0, double p1, double p2) {
        checkState();
        return delegate.getNearbyEntities(p0, p1, p2);
    }

    @Override
    public int getNoDamageTicks() {
        checkState();
        return delegate.getNoDamageTicks();
    }

    @Override
    public void setNoDamageTicks(int p0) {
        checkState();
        delegate.setNoDamageTicks(p0);
    }

    @Override
    public org.bukkit.inventory.InventoryView getOpenInventory() {
        checkState();
        return delegate.getOpenInventory();
    }

    @Override
    public java.util.List<org.bukkit.entity.Entity> getPassengers() {
        checkState();
        return delegate.getPassengers();
    }

    @Override
    public org.bukkit.entity.Player getPlayer() {
        checkState();
        return delegate.getPlayer();
    }

    @Override
    public java.lang.String getPlayerListName() {
        checkState();
        return delegate.getPlayerListName();
    }

    @Override
    public void setPlayerListName(java.lang.String p0) {
        checkState();
        delegate.setPlayerListName(p0);
    }

    @Override
    public long getPlayerTime() {
        checkState();
        return delegate.getPlayerTime();
    }

    @Override
    public long getPlayerTimeOffset() {
        checkState();
        return delegate.getPlayerTimeOffset();
    }

    @Override
    public org.bukkit.WeatherType getPlayerWeather() {
        checkState();
        return delegate.getPlayerWeather();
    }

    @Override
    public void setPlayerWeather(org.bukkit.WeatherType p0) {
        checkState();
        delegate.setPlayerWeather(p0);
    }

    @Override
    public int getRemainingAir() {
        checkState();
        return delegate.getRemainingAir();
    }

    @Override
    public void setRemainingAir(int p0) {
        checkState();
        delegate.setRemainingAir(p0);
    }

    @Override
    public boolean getRemoveWhenFarAway() {
        checkState();
        return delegate.getRemoveWhenFarAway();
    }

    @Override
    public void setRemoveWhenFarAway(boolean p0) {
        checkState();
        delegate.setRemoveWhenFarAway(p0);
    }

    @Override
    public float getSaturation() {
        checkState();
        return delegate.getSaturation();
    }

    @Override
    public void setSaturation(float p0) {
        checkState();
        delegate.setSaturation(p0);
    }

    @Override
    public org.bukkit.scoreboard.Scoreboard getScoreboard() {
        checkState();
        return delegate.getScoreboard();
    }

    @Override
    public void setScoreboard(org.bukkit.scoreboard.Scoreboard p0) {
        checkState();
        delegate.setScoreboard(p0);
    }

    @Override
    public org.bukkit.Server getServer() {
        checkState();
        return delegate.getServer();
    }

    @Override
    public int getSleepTicks() {
        checkState();
        return delegate.getSleepTicks();
    }

    @Override
    public Spigot getSpigot() {
        checkState();
        return delegate.spigot();
    }

    @Override
    public int getTicksLived() {
        checkState();
        return delegate.getTicksLived();
    }

    @Override
    public void setTicksLived(int p0) {
        checkState();
        delegate.setTicksLived(p0);
    }

    @Override
    public int getTotalExperience() {
        checkState();
        return delegate.getTotalExperience();
    }

    @Override
    public void setTotalExperience(int p0) {
        checkState();
        delegate.setTotalExperience(p0);
    }

    @Override
    public org.bukkit.entity.EntityType getType() {
        checkState();
        return delegate.getType();
    }

    @Override
    public java.util.UUID getUniqueId() {
        checkState();
        return delegate.getUniqueId();
    }

    @Override
    public org.bukkit.entity.Entity getVehicle() {
        checkState();
        return delegate.getVehicle();
    }

    @Override
    public org.bukkit.util.Vector getVelocity() {
        checkState();
        return delegate.getVelocity();
    }

    @Override
    public void setVelocity(org.bukkit.util.Vector p0) {
        checkState();
        delegate.setVelocity(p0);
    }

    @Override
    public float getWalkSpeed() {
        checkState();
        return delegate.getWalkSpeed();
    }

    @Override
    public void setWalkSpeed(float p0) {
        checkState();
        delegate.setWalkSpeed(p0);
    }

    @Override
    public org.bukkit.World getWorld() {
        checkState();
        return delegate.getWorld();
    }

    @Override
    public void giveExp(int p0) {
        checkState();
        delegate.giveExp(p0);
    }

    @Override
    public void giveExpLevels(int p0) {
        checkState();
        delegate.giveExpLevels(p0);
    }

    @Override
    public boolean hasLineOfSight(org.bukkit.entity.Entity p0) {
        checkState();
        return delegate.hasLineOfSight(p0);
    }

    @Override
    public boolean hasMetadata(java.lang.String p0) {
        checkState();
        return delegate.hasMetadata(p0);
    }

    @Override
    public boolean hasPermission(java.lang.String p0) {
        checkState();
        return delegate.hasPermission(p0);
    }

    @Override
    public boolean hasPermission(org.bukkit.permissions.Permission p0) {
        checkState();
        return delegate.hasPermission(p0);
    }

    @Override
    public boolean hasPlayedBefore() {
        checkState();
        return delegate.hasPlayedBefore();
    }

    @Override
    public boolean hasPotionEffect(org.bukkit.potion.PotionEffectType p0) {
        checkState();
        return delegate.hasPotionEffect(p0);
    }

    @Override
    public void hidePlayer(org.bukkit.entity.Player p0) {
        checkState();
        delegate.hidePlayer(p0);
    }

    @Override
    public void incrementStatistic(org.bukkit.Statistic p0) {
        checkState();
        delegate.incrementStatistic(p0);
    }

    @Override
    public void incrementStatistic(org.bukkit.Statistic p0, int p1) {
        checkState();
        delegate.incrementStatistic(p0, p1);
    }

    @Override
    public void incrementStatistic(org.bukkit.Statistic p0, org.bukkit.Material p1) {
        checkState();
        delegate.incrementStatistic(p0, p1);
    }

    @Override
    public void incrementStatistic(org.bukkit.Statistic p0, org.bukkit.Material p1, int p2) {
        checkState();
        delegate.incrementStatistic(p0, p1, p2);
    }

    @Override
    public boolean isBanned() {
        checkState();
        return delegate.isBanned();
    }

    @Override
    public void setBanned(boolean p0) {
        checkState();
        Bukkit.getBanList(Type.NAME).addBan(delegate.getName(), ChatColor.RED + "You are banned from tregmine!", null,
                null);
    }

    @Override
    public boolean isBlocking() {
        checkState();
        return delegate.isBlocking();
    }

    @Override
    public boolean isConversing() {
        checkState();
        return delegate.isConversing();
    }

    @Override
    public boolean isCustomNameVisible() {
        checkState();
        return delegate.isCustomNameVisible();
    }

    @Override
    public void setCustomNameVisible(boolean p0) {
        checkState();
        delegate.setCustomNameVisible(p0);
    }

    @Override
    public boolean isDead() {
        checkState();
        return delegate.isDead();
    }

    @Override
    public boolean isEmpty() {
        checkState();
        return delegate.isEmpty();
    }

    @Override
    public boolean isFlying() {
        checkState();
        return delegate.isFlying();
    }

    @Override
    public void setFlying(boolean p0) {
        checkState();
        delegate.setFlying(p0);
    }

    @Override
    public boolean isHealthScaled() {
        checkState();
        return delegate.isHealthScaled();
    }

    @Override
    public void setHealthScaled(boolean p0) {
        checkState();
        delegate.setHealthScaled(p0);
    }

    @Override
    public boolean isInsideVehicle() {
        checkState();
        return delegate.isInsideVehicle();
    }

    @Override
    public boolean isLeashed() {
        checkState();
        return delegate.isLeashed();
    }

    @Override
    public boolean isOnline() {
        checkState();
        return delegate.isOnline();
    }

    @Override
    public boolean isOp() {
        checkState();
        return delegate.isOp();
    }

    @Override
    public void setOp(boolean p0) {
        checkState();
        delegate.setOp(p0);
    }

    @Override
    public boolean isPermissionSet(java.lang.String p0) {
        checkState();
        return delegate.isPermissionSet(p0);
    }

    @Override
    public boolean isPermissionSet(org.bukkit.permissions.Permission p0) {
        checkState();
        return delegate.isPermissionSet(p0);
    }

    @Override
    public boolean isPlayerTimeRelative() {
        checkState();
        return delegate.isPlayerTimeRelative();
    }

    @Override
    public boolean isSleeping() {
        checkState();
        return delegate.isSleeping();
    }

    @Override
    public boolean isSleepingIgnored() {
        checkState();
        return delegate.isSleepingIgnored();
    }

    @Override
    public void setSleepingIgnored(boolean p0) {
        checkState();
        delegate.setSleepingIgnored(p0);
    }

    @Override
    public boolean isSneaking() {
        checkState();
        return delegate.isSneaking();
    }

    @Override
    public void setSneaking(boolean p0) {
        checkState();
        delegate.setSneaking(p0);
    }

    @Override
    public boolean isSprinting() {
        checkState();
        return delegate.isSprinting();
    }

    @Override
    public void setSprinting(boolean p0) {
        checkState();
        delegate.setSprinting(p0);
    }

    @Override
    public boolean isValid() {
        checkState();
        return delegate.isValid();
    }

    @Override
    public boolean isWhitelisted() {
        checkState();
        return delegate.isWhitelisted();
    }

    @Override
    public void setWhitelisted(boolean p0) {
        checkState();
        delegate.setWhitelisted(p0);
    }

    @Override
    public void kickPlayer(Tregmine instance, final java.lang.String p0) {
        checkState();
        // delegate.kickPlayer(p0);
        Bukkit.getScheduler().scheduleSyncDelayedTask(instance, new Runnable() {

            @Override
            public void run() {
                delegate.kickPlayer(p0);
            }

        });
    }

    @Override
    public <T extends org.bukkit.entity.Projectile> T launchProjectile(java.lang.Class<? extends T> p0) {
        checkState();
        return delegate.launchProjectile(p0);
    }

    @Override
    public boolean leaveVehicle() {
        checkState();
        return delegate.leaveVehicle();
    }

    @Override
    public void loadData() {
        checkState();
        delegate.loadData();
    }

    @Override
    public org.bukkit.inventory.InventoryView openEnchanting(org.bukkit.Location p0, boolean p1) {
        checkState();
        return delegate.openEnchanting(p0, p1);
    }

    @Override
    public org.bukkit.inventory.InventoryView openInventory(org.bukkit.inventory.Inventory p0) {
        checkState();
        return delegate.openInventory(p0);
    }

    @Override
    public void openInventory(org.bukkit.inventory.InventoryView p0) {
        checkState();
        delegate.openInventory(p0);
    }

    @Override
    public org.bukkit.inventory.InventoryView openWorkbench(org.bukkit.Location p0, boolean p1) {
        checkState();
        return delegate.openWorkbench(p0, p1);
    }

    @Override
    public boolean performCommand(java.lang.String p0) {
        checkState();
        return delegate.performCommand(p0);
    }

    @Override
    public void playEffect(org.bukkit.EntityEffect p0) {
        checkState();
        delegate.playEffect(p0);
    }

    @Override
    public <T extends java.lang.Object> void playEffect(org.bukkit.Location p0, org.bukkit.Effect p1, T p2) {
        checkState();
        delegate.playEffect(p0, p1, p2);
    }

    @Override
    public void playNote(org.bukkit.Location p0, org.bukkit.Instrument p1, org.bukkit.Note p2) {
        checkState();
        delegate.playNote(p0, p1, p2);
    }

    @Override
    public void playSound(org.bukkit.Location p0, org.bukkit.Sound p1, float p2, float p3) {
        checkState();
        delegate.playSound(p0, p1, p2, p3);
    }

    @Override
    public void recalculatePermissions() {
        checkState();
        delegate.recalculatePermissions();
    }

    @Override
    public void remove() {
        checkState();
        delegate.remove();
    }

    @Override
    public void removeAttachment(org.bukkit.permissions.PermissionAttachment p0) {
        checkState();
        delegate.removeAttachment(p0);
    }

    @Override
    public void removeMetadata(java.lang.String p0, org.bukkit.plugin.Plugin p1) {
        checkState();
        delegate.removeMetadata(p0, p1);
    }

    @Override
    public void removePotionEffect(org.bukkit.potion.PotionEffectType p0) {
        checkState();
        delegate.removePotionEffect(p0);
    }

    @Override
    public void resetMaxHealth() {
        checkState();
        delegate.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(20.0);
    }

    @Override
    public void resetPlayerTime() {
        checkState();
        delegate.resetPlayerTime();
    }

    @Override
    public void resetPlayerWeather() {
        checkState();
        delegate.resetPlayerWeather();
    }

    @Override
    public void saveData() {
        checkState();
        delegate.saveData();
    }

    @Override
    public void sendMap(org.bukkit.map.MapView p0) {
        checkState();
        delegate.sendMap(p0);
    }

    @Override
    public void sendPluginMessage(org.bukkit.plugin.Plugin p0, java.lang.String p1, byte[] p2) {
        checkState();
        delegate.sendPluginMessage(p0, p1, p2);
    }

    @Override
    public void sendRawMessage(java.lang.String p0) {
        checkState();
        delegate.sendRawMessage(p0);
    }

    @Override
    public void sendMessage(BaseComponent... a) {
        checkState();
        if (getHandle().playerConnection == null)
            return;
        this.getDelegate().spigot().sendMessage(a);
    }

    @Override
    public void sendMessage(String message) {
        checkState();
        delegate.sendMessage(message);
    }

    @Override
    public java.util.Map<java.lang.String, java.lang.Object> serialize() {
        checkState();
        return delegate.serialize();
    }

    @Override
    public void setBedSpawnLocation(org.bukkit.Location p0, boolean p1) {
        checkState();
        delegate.setBedSpawnLocation(p0, p1);
    }

    @Override
    public boolean setLeashHolder(org.bukkit.entity.Entity p0) {
        checkState();
        return delegate.setLeashHolder(p0);
    }

    @Override
    public void setMetadata(java.lang.String p0, org.bukkit.metadata.MetadataValue p1) {
        checkState();
        delegate.setMetadata(p0, p1);
    }

    @Override
    public boolean addPassenger(org.bukkit.entity.Entity p0) {
        checkState();
        return delegate.addPassenger(p0);
    }

    @Override
    public void setPermission(java.lang.String p0) {
        checkState();
    }

    @Override
    public void setPlayerTime(long p0, boolean p1) {
        checkState();
        delegate.setPlayerTime(p0, p1);
    }

    @Override
    public void setResourcePack(java.lang.String p0) {
        checkState();
        delegate.setResourcePack(p0);
    }

    @Override
    public boolean setWindowProperty(org.bukkit.inventory.InventoryView.Property p0, int p1) {
        checkState();
        return delegate.setWindowProperty(p0, p1);
    }

    @Override
    public void showPlayer(org.bukkit.entity.Player p0) {
        checkState();
        delegate.showPlayer(p0);
    }

    @Override
    public Player.Spigot spigot() {
        return delegate.spigot();
    }

    @Override
    public boolean teleport(org.bukkit.entity.Entity p0) {
        checkState();
        return delegate.teleport(p0);
    }

    @Override
    public boolean teleport(org.bukkit.entity.Entity p0, org.bukkit.event.player.PlayerTeleportEvent.TeleportCause p1) {
        checkState();
        return delegate.teleport(p0, p1);
    }

    @Override
    public boolean teleport(org.bukkit.Location p0) {
        checkState();
        return delegate.teleport(p0);
    }

    @Override
    public boolean teleport(org.bukkit.Location p0, org.bukkit.event.player.PlayerTeleportEvent.TeleportCause p1) {
        checkState();
        return delegate.teleport(p0, p1);
    }

}
