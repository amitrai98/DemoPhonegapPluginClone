module.exports = {
    greet: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Hello", "greet", [name]);
    },

    initializeVideoCalling: function (object, successCallback, errorCallback) {
            cordova.exec(successCallback, errorCallback, "VideoPlugin", "initializeVideoCalling", [object]);
    }
};