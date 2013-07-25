package info.tregmine.api;

import java.util.Map;
import java.util.HashMap;
import java.util.Date;
//import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import info.tregmine.api.encryption.BCrypt;
import info.tregmine.zones.Zone;

public class TregminePlayer extends PlayerDelegate
{
    public enum GuardianState {
        ACTIVE, INACTIVE, QUEUED;
    };

    public enum ChatState {
        SETUP, CHAT, TRADE, SELL;
    };

    @SuppressWarnings("serial")
    private final static Map<String, ChatColor> COLORS =
            new HashMap<String, ChatColor>() {
                {
                    put("admin", ChatColor.RED);
                    put("broker", ChatColor.DARK_RED);
                    put("child", ChatColor.AQUA);
                    put("donator", ChatColor.GOLD);
                    put("helper", ChatColor.YELLOW);
                    put("hunter", ChatColor.BLUE);
                    put("mentor", ChatColor.DARK_AQUA);
                    put("pink", ChatColor.LIGHT_PURPLE);
                    put("police", ChatColor.BLUE);
                    put("purle", ChatColor.DARK_PURPLE);
                    put("trial", ChatColor.GREEN);
                    put("trusted", ChatColor.DARK_GREEN);
                    put("vampire", ChatColor.DARK_RED);
                    put("warned", ChatColor.GRAY);
                    put("white", ChatColor.WHITE);
                }
            };

    // Persistent values
    private int id = 0;
    private String name = null;
    private String password = null;
    private String keyword = null;
    private String countryName = null;
    private String city = null;
    private String ip = null;
    private String postalCode = null;
    private String region = null;
    private String hostName = null;
    private String color = "white";
    private String tempColor = null;
    private String timezone = "Europe/Stockholm";
    private String quitMessage = null;
    private boolean hiddenLocation = false;
    private boolean invisible = false;
    private boolean admin = false;
    private boolean donator = false;
    private boolean trusted = false;
    private boolean resident = false;
    private boolean child = false;
    private boolean guardian = false;
    private boolean builder = false;
    private boolean teleportShield = false;
    private boolean setup = false;
    private int guardianRank = 0;
    private int mentorId = 0;
    private int playTime = 0;

    // One-time state
    private String chatChannel = "GLOBAL";
    private String texture = "https://dl.dropbox.com/u/5405236/mc/df.zip";
    private Zone currentZone = null;
    private GuardianState guardianState = null;
    private int blessTarget = 0;
    private ChatState chatState = ChatState.CHAT;
    private Date loginTime = null;
    private boolean valid = true;

    // Player state for block fill
    private Block fillBlock1 = null;
    private Block fillBlock2 = null;
    private int fillBlockCounter = 0;

    // Player state for zone creation
    private Block zoneBlock1 = null;
    private Block zoneBlock2 = null;
    private int zoneBlockCounter = 0;
    private int targetZoneId = 0;

    public TregminePlayer(Player player)
    {
        super(player);

        this.name = player.getName();
        this.loginTime = new Date();
    }

    public TregminePlayer(String name)
    {
        super(null);

        this.name = name;
    }

    public void setId(int v) { this.id = v; }
    public int getId() { return id; }

    public String getChatName()
    {
        return name;
    }

    public void setTemporaryChatName(String name)
    {
        this.name = name;

        if (getChatName().length() > 16) {
            setPlayerListName(name.substring(0, 15));
        }
        else {
            setPlayerListName(name);
        }
    }

    public void setPassword(String newPassword)
    {
        password = BCrypt.hashpw(newPassword, BCrypt.gensalt());
    }

    public String getPasswordHash()
    {
        return password;
    }

    public boolean verifyPassword(String attempt)
    {
        return BCrypt.checkpw(attempt, password);
    }

    public String getKeyword() { return keyword; }
    public void setKeyword(String v) { this.keyword = v; }

    public String getCountryName() { return countryName; }
    public void setCountryName(String v) { this.countryName = v; }

    public String getCity() { return city; }
    public void setCity(String v) { this.city = v; }

    public String getIp() { return ip; }
    public void setIp(String v) { this.ip = v; }

    public String getPostalCode() { return postalCode; }
    public void setPostalCode(String v) { this.postalCode = v; }

    public String getRegion() { return region; }
    public void setRegion(String v) { this.region = v; }

    public String getHostName() { return hostName; }
    public void setHostName(String v) { this.hostName = v; }

    public boolean hasHiddenLocation() { return hiddenLocation; }
    public void setHiddenLocation(boolean v) { this.hiddenLocation = v; }

    public void setAdmin(boolean v) { this.admin = v; }
    public boolean isAdmin() { return admin; }

    public void setDonator(boolean v) { this.donator = v; }
    public boolean isDonator() { return donator; }

    public void setTrusted(boolean v) { this.trusted = v; }
    public boolean isTrusted() { return trusted; }

    public void setResident(boolean v) { this.resident = v; }
    public boolean isResident() { return resident; }

    public void setChild(boolean v) { this.child = v; }
    public boolean isChild() { return child; }

    public void setGuardian(boolean v) { this.guardian = v; }
    public boolean isGuardian() { return guardian; }

    public void setBuilder(boolean v) { this.builder = v; }
    public boolean isBuilder() { return builder; }

    public void setSetup(boolean v) { this.setup = v; }
    public boolean isSetup() { return setup; }

    public void setGuardianRank(int v) { this.guardianRank = v; }
    public int getGuardianRank() { return guardianRank; }

    public void setMentorId(int id) { this.mentorId = id; }
    public int getMentorId() { return mentorId; }

    public void setPlayTime(int v) { this.playTime = v; }
    public int getPlayTime() { return playTime; }

    // non-persistent state methods

    public GuardianState getGuardianState()
    {
        return guardianState;
    }

    public void setGuardianState(GuardianState v)
    {
        this.guardianState = v;

        switch (v) {
        case ACTIVE:
            this.color = "police";
            break;
        case INACTIVE:
        case QUEUED:
            this.color = "donator";
            break;
        }

        setTemporaryChatName(getNameColor() + getName());
    }

    public void setTimezone(String v) { this.timezone = v; }
    public String getTimezone() { return timezone; }

    public void setQuitMessage(String v) { this.quitMessage = v; }
    public String getQuitMessage() { return quitMessage; }

    public ChatColor getNameColor()
    {
        if (tempColor != null) {
            return COLORS.get(tempColor);
        }
        return COLORS.get(color);
    }

    public void setNameColor(String v)
    {
        this.color = v;
    }

    public void setTempColor(String v)
    {
        this.tempColor = v;
    }

    public String getColor()
    {
        return color;
    }

    public void setInvisible(boolean v) { this.invisible = v; }
    public Boolean isInvisible() { return invisible; }

    public void setCurrentZone(Zone zone) { this.currentZone = zone; }
    public Zone getCurrentZone() { return currentZone; }

    public void setCurrentTexture(String url)
    {
        if (url == null) {
            this.texture = "https://dl.dropbox.com/u/5405236/mc/df.zip";
        }

        if (!url.equals(this.texture)) {
            this.texture = url;
            setTexturePack(url);
        }
    }

    public void setChatChannel(String v) { this.chatChannel = v; }
    public String getChatChannel() { return chatChannel; }

    public void setBlessTarget(int v) { this.blessTarget = v; }
    public int getBlessTarget() { return blessTarget; }

    public void setTeleportShield(boolean v) { this.teleportShield = v; }
    public boolean hasTeleportShield() { return teleportShield; }

    public void setChatState(ChatState v) { this.chatState = v; }
    public ChatState getChatState() { return chatState; }

    public void resetTimeOnline()
    {
        loginTime = new Date();
    }

    public int getTimeOnline()
    {
        return (int)((new Date().getTime() - loginTime.getTime())/1000L);
    }

    public boolean isValid() { return valid; }
    public void setValid(boolean v) { this.valid = v; }

    // block fill state
    public void setFillBlock1(Block v) { this.fillBlock1 = v; }
    public Block getFillBlock1() { return fillBlock1; }

    public void setFillBlock2(Block v) { this.fillBlock2 = v; }
    public Block getFillBlock2() { return fillBlock2; }

    public void setFillBlockCounter(int v) { this.fillBlockCounter = v; }
    public int getFillBlockCounter() { return fillBlockCounter; }

    // zones state
    public void setZoneBlock1(Block v) { this.zoneBlock1 = v; }
    public Block getZoneBlock1() { return zoneBlock1; }

    public void setZoneBlock2(Block v) { this.zoneBlock2 = v; }
    public Block getZoneBlock2() { return zoneBlock2; }

    public void setZoneBlockCounter(int v) { this.zoneBlockCounter = v; }
    public int getZoneBlockCounter() { return zoneBlockCounter; }

    public void setTargetZoneId(int v) { this.targetZoneId = v; }
    public int getTargetZoneId() { return targetZoneId; }

    // convenience methods
    public void hidePlayer(TregminePlayer player)
    {
        hidePlayer(player.getDelegate());
    }

    public void showPlayer(TregminePlayer player)
    {
        showPlayer(player.getDelegate());
    }

    // java.lang.Object overrides
    @Override
    public boolean equals(Object obj)
    {
        return ((TregminePlayer) obj).getId() == getId();
    }

    @Override
    public int hashCode()
    {
        return getId();
    }
}
