package typings.youtube.YT

import typings.youtube.youtubeNumbers.`0`
import typings.youtube.youtubeNumbers.`1`
import typings.youtube.youtubeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.youtube.youtubeNumbers.`0`
  - typings.youtube.youtubeNumbers.`1`
  - typings.youtube.youtubeNumbers.`2`
*/
trait Controls extends js.Object

object Controls {
  /**
  		 * Player controls do not display.
  		 */
  @scala.inline
  def Hide: `0` = this.cast(0)
  /**
  		 * Player controls display after a delay.
  		 */
  @scala.inline
  def ShowDelayLoadPlayer: `2` = this.cast(2)
  /**
  		 * Player controls display.
  		 */
  @scala.inline
  def ShowLoadPlayer: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

