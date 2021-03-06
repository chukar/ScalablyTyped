package typings.umbraco.umbraco.services

import typings.angular.angularMod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.tinyMceService
  *
  *
  * @description
  * A service containing all logic for all of the Umbraco TinyMCE plugins
  */
trait ITinyMceService extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.services.tinyMceService#configuration
    * @methodOf umbraco.services.tinyMceService
    *
    * @description
    * Returns a collection of plugins available to the tinyMCE editor
    *
    */
  def configuration(): js.Array[ITinyMcePlugin]
  /**
    * @ngdoc method
    * @name umbraco.services.tinyMceService#createInsertEmbeddedMedia
    * @methodOf umbraco.services.tinyMceService
    *
    * @description
    * Creates the umbrco insert embedded media tinymce plugin
    *
    * @param {Object} editor the TinyMCE editor instance
    * @param {Object} $scope the current controller scope
    */
  def createInsertEmbeddedMedia(editor: js.Object, $scope: IScope): Unit
  /**
    * @ngdoc method
    * @name umbraco.services.tinyMceService#createUmbracoMacro
    * @methodOf umbraco.services.tinyMceService
    *
    * @description
    * Creates the insert umbrco macro tinymce plugin
    *
    * @param {Object} editor the TinyMCE editor instance
    * @param {Object} $scope the current controller scope
    */
  def createInsertMacro(editor: js.Object, $scope: IScope): Unit
  /**
    * @ngdoc method
    * @name umbraco.services.tinyMceService#createMediaPicker
    * @methodOf umbraco.services.tinyMceService
    *
    * @description
    * Creates the umbrco insert media tinymce plugin
    *
    * @param {Object} editor the TinyMCE editor instance
    * @param {Object} $scope the current controller scope
    */
  def createMediaPicker(editor: js.Object): Unit
  /**
    * @ngdoc method
    * @name umbraco.services.tinyMceService#defaultPrevalues
    * @methodOf umbraco.services.tinyMceService
    *
    * @description
    * Returns a default configration to fallback on in case none is provided
    *
    */
  def defaultPrevalues(): IConfiguration
}

object ITinyMceService {
  @scala.inline
  def apply(
    configuration: () => js.Array[ITinyMcePlugin],
    createInsertEmbeddedMedia: (js.Object, IScope) => Unit,
    createInsertMacro: (js.Object, IScope) => Unit,
    createMediaPicker: js.Object => Unit,
    defaultPrevalues: () => IConfiguration
  ): ITinyMceService = {
    val __obj = js.Dynamic.literal(configuration = js.Any.fromFunction0(configuration), createInsertEmbeddedMedia = js.Any.fromFunction2(createInsertEmbeddedMedia), createInsertMacro = js.Any.fromFunction2(createInsertMacro), createMediaPicker = js.Any.fromFunction1(createMediaPicker), defaultPrevalues = js.Any.fromFunction0(defaultPrevalues))
  
    __obj.asInstanceOf[ITinyMceService]
  }
}

