package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioDescription extends js.Object {
  /**
    * Advanced audio normalization settings. Ignore these settings unless you need to comply with a loudness standard.
    */
  var AudioNormalizationSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.AudioNormalizationSettings] = js.native
  /**
    * Specifies which audio data to use from each input. In the simplest case, specify an "Audio Selector":#inputs-audio_selector by name based on its order within each input. For example if you specify "Audio Selector 3", then the third audio selector will be used from each input. If an input does not have an "Audio Selector 3", then the audio selector marked as "default" in that input will be used. If there is no audio selector marked as "default", silence will be inserted for the duration of that input. Alternatively, an "Audio Selector Group":#inputs-audio_selector_group name may be specified, with similar default/silence behavior. If no audio_source_name is specified, then "Audio Selector 1" will be chosen automatically.
    */
  var AudioSourceName: js.UndefOr[__string] = js.native
  /**
    * Applies only if Follow Input Audio Type is unchecked (false). A number between 0 and 255. The following are defined in ISO-IEC 13818-1: 0 = Undefined, 1 = Clean Effects, 2 = Hearing Impaired, 3 = Visually Impaired Commentary, 4-255 = Reserved.
    */
  var AudioType: js.UndefOr[__integerMin0Max255] = js.native
  /**
    * When set to FOLLOW_INPUT, if the input contains an ISO 639 audio_type, then that value is passed through to the output. If the input contains no ISO 639 audio_type, the value in Audio Type is included in the output. Otherwise the value in Audio Type is included in the output. Note that this field and audioType are both ignored if audioDescriptionBroadcasterMix is set to BROADCASTER_MIXED_AD.
    */
  var AudioTypeControl: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.AudioTypeControl] = js.native
  /**
    * Audio codec settings (CodecSettings) under (AudioDescriptions) contains the group of settings related to audio encoding. The settings in this group vary depending on the value that you choose for Audio codec (Codec). For each codec enum that you choose, define the corresponding settings object. The following lists the codec enum, settings object pairs. * AAC, AacSettings * MP2, Mp2Settings * WAV, WavSettings * AIFF, AiffSettings * AC3, Ac3Settings * EAC3, Eac3Settings * EAC3_ATMOS, Eac3AtmosSettings
    */
  var CodecSettings: js.UndefOr[AudioCodecSettings] = js.native
  /**
    * Specify the language for this audio output track. The service puts this language code into your output audio track when you set Language code control (AudioLanguageCodeControl) to Use configured (USE_CONFIGURED). The service also uses your specified custom language code when you set Language code control (AudioLanguageCodeControl) to Follow input (FOLLOW_INPUT), but your input file doesn't specify a language code. For all outputs, you can use an ISO 639-2 or ISO 639-3 code. For streaming outputs, you can also use any other code in the full RFC-5646 specification. Streaming outputs are those that are in one of the following output groups: CMAF, DASH ISO, Apple HLS, or Microsoft Smooth Streaming.
    */
  var CustomLanguageCode: js.UndefOr[__stringPatternAZaZ23AZaZ] = js.native
  /**
    * Indicates the language of the audio output track. The ISO 639 language specified in the 'Language Code' drop down will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language Code' is selected but there is no ISO 639 language code specified by the input.
    */
  var LanguageCode: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.LanguageCode] = js.native
  /**
    * Specify which source for language code takes precedence for this audio track. When you choose Follow input (FOLLOW_INPUT), the service uses the language code from the input track if it's present. If there's no languge code on the input track, the service uses the code that you specify in the setting Language code (languageCode or customLanguageCode). When you choose Use configured (USE_CONFIGURED), the service uses the language code that you specify.
    */
  var LanguageCodeControl: js.UndefOr[AudioLanguageCodeControl] = js.native
  /**
    * Advanced audio remixing settings.
    */
  var RemixSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.RemixSettings] = js.native
  /**
    * Specify a label for this output audio stream. For example, "English", "Director commentary", or "track_2". For streaming outputs, MediaConvert passes this information into destination manifests for display on the end-viewer's player device. For outputs in other output groups, the service ignores this setting.
    */
  var StreamName: js.UndefOr[__stringPatternWS] = js.native
}

object AudioDescription {
  @scala.inline
  def apply(
    AudioNormalizationSettings: AudioNormalizationSettings = null,
    AudioSourceName: __string = null,
    AudioType: Int | Double = null,
    AudioTypeControl: AudioTypeControl = null,
    CodecSettings: AudioCodecSettings = null,
    CustomLanguageCode: __stringPatternAZaZ23AZaZ = null,
    LanguageCode: LanguageCode = null,
    LanguageCodeControl: AudioLanguageCodeControl = null,
    RemixSettings: RemixSettings = null,
    StreamName: __stringPatternWS = null
  ): AudioDescription = {
    val __obj = js.Dynamic.literal()
    if (AudioNormalizationSettings != null) __obj.updateDynamic("AudioNormalizationSettings")(AudioNormalizationSettings.asInstanceOf[js.Any])
    if (AudioSourceName != null) __obj.updateDynamic("AudioSourceName")(AudioSourceName.asInstanceOf[js.Any])
    if (AudioType != null) __obj.updateDynamic("AudioType")(AudioType.asInstanceOf[js.Any])
    if (AudioTypeControl != null) __obj.updateDynamic("AudioTypeControl")(AudioTypeControl.asInstanceOf[js.Any])
    if (CodecSettings != null) __obj.updateDynamic("CodecSettings")(CodecSettings.asInstanceOf[js.Any])
    if (CustomLanguageCode != null) __obj.updateDynamic("CustomLanguageCode")(CustomLanguageCode.asInstanceOf[js.Any])
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LanguageCodeControl != null) __obj.updateDynamic("LanguageCodeControl")(LanguageCodeControl.asInstanceOf[js.Any])
    if (RemixSettings != null) __obj.updateDynamic("RemixSettings")(RemixSettings.asInstanceOf[js.Any])
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioDescription]
  }
}

