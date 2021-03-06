package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a PublishResponse. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.PublishResponse")
@js.native
/**
  * Constructs a new PublishResponse.
  * @param [properties] Properties to set
  */
class PublishResponse () extends IPublishResponse {
  def this(properties: IPublishResponse) = this()
  /** PublishResponse messageIds. */
  @JSName("messageIds")
  var messageIds_PublishResponse: js.Array[String] = js.native
  /**
    * Converts this PublishResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.PublishResponse")
@js.native
object PublishResponse extends js.Object {
  /**
    * Creates a new PublishResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PublishResponse instance
    */
  def create(): PublishResponse = js.native
  def create(properties: IPublishResponse): PublishResponse = js.native
  /**
    * Decodes a PublishResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PublishResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): PublishResponse = js.native
  def decode(reader: Reader, length: Double): PublishResponse = js.native
  def decode(reader: Uint8Array): PublishResponse = js.native
  def decode(reader: Uint8Array, length: Double): PublishResponse = js.native
  /**
    * Decodes a PublishResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PublishResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): PublishResponse = js.native
  def decodeDelimited(reader: Uint8Array): PublishResponse = js.native
  /**
    * Encodes the specified PublishResponse message. Does not implicitly {@link google.pubsub.v1.PublishResponse.verify|verify} messages.
    * @param message PublishResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPublishResponse): Writer = js.native
  def encode(message: IPublishResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified PublishResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.PublishResponse.verify|verify} messages.
    * @param message PublishResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPublishResponse): Writer = js.native
  def encodeDelimited(message: IPublishResponse, writer: Writer): Writer = js.native
  /**
    * Creates a PublishResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PublishResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): PublishResponse = js.native
  /**
    * Creates a plain object from a PublishResponse message. Also converts values to other types if specified.
    * @param message PublishResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: PublishResponse): StringDictionary[js.Any] = js.native
  def toObject(message: PublishResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a PublishResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

