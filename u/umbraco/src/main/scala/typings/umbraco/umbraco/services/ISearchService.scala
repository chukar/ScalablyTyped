package typings.umbraco.umbraco.services

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.searchService
  *
  *
  * @description
  * Service for handling the main application search, can currently search content, media and members
  *
  */
trait ISearchService extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.services.searchService#searchAll
    * @methodOf umbraco.services.searchService
    *
    * @description
    * Searches all available indexes and returns all results in one collection
    * @param {Object} args argument object
    * @param {String} args.term seach term
    * @returns {Promise} returns promise containing all matching items
    */
  def searchAll(args: ISearchArgs): IPromise[_]
  /**
    * @ngdoc method
    * @name umbraco.services.searchService#searchContent
    * @methodOf umbraco.services.searchService
    *
    * @description
    * Searches the default internal content search index
    * @param {Object} args argument object
    * @param {String} args.term seach term
    * @returns {Promise} returns promise containing all matching content items
    */
  def searchContent(args: ISearchArgs): IPromise[js.Array[ISearchContent]]
  /**
    * @ngdoc method
    * @name umbraco.services.searchService#searchMedia
    * @methodOf umbraco.services.searchService
    *
    * @description
    * Searches the default media search index
    * @param {Object} args argument object
    * @param {String} args.term seach term
    * @returns {Promise} returns promise containing all matching media items
    */
  def searchMedia(args: ISearchArgs): IPromise[js.Array[ISearchMedia]]
  /**
    * @ngdoc method
    * @name umbraco.services.searchService#searchMembers
    * @methodOf umbraco.services.searchService
    *
    * @description
    * Searches the default member search index
    * @param {Object} args argument object
    * @param {String} args.term seach term
    * @returns {Promise} returns promise containing all matching members
    */
  def searchMembers(args: ISearchArgs): IPromise[js.Array[ISearchMember]]
}

object ISearchService {
  @scala.inline
  def apply(
    searchAll: ISearchArgs => IPromise[_],
    searchContent: ISearchArgs => IPromise[js.Array[ISearchContent]],
    searchMedia: ISearchArgs => IPromise[js.Array[ISearchMedia]],
    searchMembers: ISearchArgs => IPromise[js.Array[ISearchMember]]
  ): ISearchService = {
    val __obj = js.Dynamic.literal(searchAll = js.Any.fromFunction1(searchAll), searchContent = js.Any.fromFunction1(searchContent), searchMedia = js.Any.fromFunction1(searchMedia), searchMembers = js.Any.fromFunction1(searchMembers))
  
    __obj.asInstanceOf[ISearchService]
  }
}

