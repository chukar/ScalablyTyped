package typings.winrtDashUwp.Windows.Media.Protection.PlayReady

import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import typings.winrtDashUwp.Windows.Media.Core.AudioStreamDescriptor
import typings.winrtDashUwp.Windows.Media.Core.IMediaStreamDescriptor
import typings.winrtDashUwp.Windows.Media.Core.MediaStreamSample
import typings.winrtDashUwp.Windows.Media.Core.VideoStreamDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains methods that a stream parser plug-in uses to send notifications to a PlayReady-ND client. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDStreamParserNotifier")
@js.native
/** Creates a new instance of the NDStreamParserNotifier class. */
class NDStreamParserNotifier () extends js.Object {
  /**
    * Called by the stream parser when it requests a setup decryptor.
    * @param descriptor The descriptor of the media stream being decrypted.
    * @param keyID The key identifier used for decryption.
    * @param proBytes The data for the setup decryptor.
    */
  def onBeginSetupDecryptor(descriptor: IMediaStreamDescriptor, keyID: String, proBytes: js.Array[Double]): Unit = js.native
  /**
    * Called by a stream parser when it receives the content identifier.
    * @param licenseFetchDescriptor The license fetch descriptor containing the content identifier.
    */
  def onContentIDReceived(licenseFetchDescriptor: INDLicenseFetchDescriptor): Unit = js.native
  /**
    * Called by the stream parser when the media stream descriptor is created.
    * @param audioStreamDescriptors An array of audio stream descriptors that are part of the media stream descriptor.
    * @param videoStreamDescriptors An array of video stream descriptors that are part of the media stream descriptor.
    */
  def onMediaStreamDescriptorCreated(
    audioStreamDescriptors: IVector[AudioStreamDescriptor],
    videoStreamDescriptors: IVector[VideoStreamDescriptor]
  ): Unit = js.native
  /**
    * Called when the stream parser parses a sample from the media stream.
    * @param streamID The identifier for the media stream that is being parsed.
    * @param streamType The type of the media stream. This value can be Audio or Video.
    * @param streamSample The array of stream samples.
    * @param pts The presentation timestamp that indicates when to play the sample, in milliseconds. This value is relative to previous samples in the presentation. For example, if a given sample has a presentation time stamp of 1000 and some later sample has a presentation time stamp of 2000, the later sample occurs one second (1000ms) after the given sample.
    * @param ccFormat The closed caption format. This value can be ATSC, SCTE20, or Unknown.
    * @param ccDataBytes An array that contains the closed caption data.
    */
  def onSampleParsed(
    streamID: Double,
    streamType: NDMediaStreamType,
    streamSample: MediaStreamSample,
    pts: Double,
    ccFormat: NDClosedCaptionFormat,
    ccDataBytes: js.Array[Double]
  ): Unit = js.native
}

