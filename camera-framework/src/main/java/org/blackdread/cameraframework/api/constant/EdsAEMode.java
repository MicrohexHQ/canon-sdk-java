package org.blackdread.cameraframework.api.constant;

import org.blackdread.camerabinding.jna.EdsdkLibrary;
import org.blackdread.cameraframework.util.LibraryFieldUtil;

/**
 * Indicates settings values of the camera in shooting mode.
 * <br>
 * When the AE Mode Dial is set to camera user settings, you will get the AE mode which is been registered to the selected camera user setting.
 * <br>
 * For the camera which AE Mode is settable, you can change the AE Mode by using kEdsPropID_AEModeSelect.
 * <br>
 * See API Reference - 5.2.17 kEdsPropID_AEMode
 * <p>Created on 2018/10/05.<p>
 *
 * @author Yoann CAPLAIN
 */
public enum EdsAEMode implements NativeEnum<Integer> {

    kEdsAEMode_Program("Program AE"),
    kEdsAEMode_Tv("Shutter-Speed Priority AE"),
    kEdsAEMode_Av("Aperture Priority AE"),
    kEdsAEMode_Manual("Manual Exposure"),
    /**
     * Note: For some models, the value of the property cannot be retrieved as kEdsPropID_AEMode.
     * In this case, Bulb is retrieved as the value of the shutter speed (kEdsPropID_Tv) property.
     * Note: Bulb is designed so that it cannot be set on cameras from a computer by means of SetPropertyData.
     */
    kEdsAEMode_Bulb("Bulb"),
    kEdsAEMode_A_DEP("Auto Depth-of-Field AE"),
    kEdsAEMode_DEP("Depth-of-Field AE"),
    kEdsAEMode_Custom("Camera settings registered"),
    kEdsAEMode_Lock("Lock"),
    kEdsAEMode_Green("Auto"),
    kEdsAEMode_NightPortrait("Night Scene Portrait"),
    kEdsAEMode_Sports("Sports"),
    kEdsAEMode_Portrait("Portrait"),
    kEdsAEMode_Landscape("Landscape"),
    kEdsAEMode_Closeup("Close-Up"),
    kEdsAEMode_FlashOff("Flash Off"),
    kEdsAEMode_CreativeAuto("Creative Auto"),
    kEdsAEMode_Movie("Movie"),
    /**
     * This value is valid for only Image
     */
    kEdsAEMode_PhotoInMovie("Photo In Movie"),
    kEdsAEMode_SceneIntelligentAuto("Scene Intelligent Auto"),
    kEdsAEMode_SCN("Unknown description"),
    kEdsAEMode_NightScenes("Night Scenes"),
    kEdsAEMode_BacklitScenes("Backlit Scenes"),
    kEdsAEMode_Children("Children"),
    kEdsAEMode_Food("Food"),
    kEdsAEMode_CandlelightPortraits("Candlelight Portraits"),
    kEdsAEMode_CreativeFilter("Creative Filter"),
    kEdsAEMode_RoughMonoChrome("Grainy B/W"),
    kEdsAEMode_SoftFocus("Soft focus"),
    kEdsAEMode_ToyCamera("Toy camera effect"),
    kEdsAEMode_Fisheye("Fish-eye effect"),
    kEdsAEMode_WaterColor("Water painting effect"),
    kEdsAEMode_Miniature("Miniature effect"),
    kEdsAEMode_Hdr_Standard("HDR art standard"),
    kEdsAEMode_Hdr_Vivid("HDR art vivid"),
    kEdsAEMode_Hdr_Bold("HDR art bold"),
    kEdsAEMode_Hdr_Embossed("HDR art embossed"),
    kEdsAEMode_Movie_Fantasy("Dream"),
    kEdsAEMode_Movie_Old("Old Movies"),
    kEdsAEMode_Movie_Memory("Memory"),
    kEdsAEMode_Movie_DirectMono("Dramatic B&W"),
    kEdsAEMode_Movie_Mini("Miniature effect movie"),
    kEdsAEMode_PanningAssist("Pannin"),
    kEdsAEMode_GroupPhoto("Group Photo"),
    kEdsAEMode_Myself("Myself"),
    kEdsAEMode_SmoothSkin("SmoothSkin"),
    kEdsAEMode_Flexible("Flexible-priority AE"),

    kEdsAEMode_Unknown("Unknown");

    private final int value;
    private final String description;

    EdsAEMode(final String description) {
        value = LibraryFieldUtil.getNativeIntValue(EdsdkLibrary.EdsAEMode.class, name());
        this.description = description;
    }

    @Override
    public final Integer value() {
        return value;
    }

    @Override
    public final String description() {
        return description;
    }
}
