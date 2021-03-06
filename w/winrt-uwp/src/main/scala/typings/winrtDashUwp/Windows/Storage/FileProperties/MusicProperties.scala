package typings.winrtDashUwp.Windows.Storage.FileProperties

import typings.winrtDashUwp.Windows.Foundation.Collections.IIterable
import typings.winrtDashUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtDashUwp.Windows.Foundation.Collections.IMap
import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the music-related properties of an item (like a file or folder). */
@JSGlobal("Windows.Storage.FileProperties.MusicProperties")
@js.native
abstract class MusicProperties () extends js.Object {
  /** Gets or sets the name of the album that contains the song. */
  var album: String = js.native
  /** Gets or sets the name of the album artist of the song. */
  var albumArtist: String = js.native
  /** Gets the artists that contributed to the song. */
  var artist: String = js.native
  /** Gets the bit rate of the song file. */
  var bitrate: Double = js.native
  /** Gets the composers of the song. */
  var composers: IVector[String] = js.native
  /** Gets the conductors of the song. */
  var conductors: IVector[String] = js.native
  /** Gets the duration of the song in milliseconds. */
  var duration: Double = js.native
  /** Gets the names of music genres that the song belongs to. */
  var genre: IVector[String] = js.native
  /** Gets the producers of the song. */
  var producers: IVector[String] = js.native
  /** Gets or sets the publisher of the song. */
  var publisher: String = js.native
  /** Gets or sets the rating associated with a music file. */
  var rating: Double = js.native
  /** Gets or sets the subtitle of the song. */
  var subtitle: String = js.native
  /** Gets or sets the title of the song */
  var title: String = js.native
  /** Gets or sets the track number of the song on the song's album. */
  var trackNumber: Double = js.native
  /** Gets the songwriters. */
  var writers: IVector[String] = js.native
  /** Gets or sets the year that the song was released. */
  var year: Double = js.native
  /**
    * Retrieves the specified properties associated with the item.
    * @param propertiesToRetrieve A collection that contains the names of the properties to retrieve.
    * @return When this method completes successfully, it returns a collection (type IMap ) that contains the specified properties and values as key-value pairs.
    */
  def retrievePropertiesAsync(propertiesToRetrieve: IIterable[String]): IPromiseWithIAsyncOperation[IMap[_, _]] = js.native
  /**
    * Saves all properties associated with the item.
    * @return No object or value is returned when this method completes.
    */
  def savePropertiesAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Saves the specified properties and values associated with the item.
    * @param propertiesToSave A collection that contains the names and values of the properties to save as key-value pairs (type IKeyValuePair ).
    * @return No object or value is returned when this method completes.
    */
  def savePropertiesAsync(propertiesToSave: IIterable[IKeyValuePair[_, _]]): IPromiseWithIAsyncAction = js.native
}

