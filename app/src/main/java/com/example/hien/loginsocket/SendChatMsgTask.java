//package com.example.hien.loginsocket;
//
//import android.os.AsyncTask;
//import android.os.Handler;
//import android.util.Log;
//
///**
// * Created by Dung Luong on 30/07/2016.
// */
//public class SendChatMsgTask extends AsyncTask<String, String, TCPClient> {
//
//    private static final String COMMAND = "shutdown -s";
//    private TCPClient tcpClient;
//    private Handler mHandler;
//    private static final String TAG = "ShutdownAsyncTask";
//
//    /**
//     * ShutdownAsyncTask constructor with handler passed as argument. The UI is updated via handler.
//     * In doInBackground(...) method, the handler is passed to TCPClient object.
//     *
//     * @param mHandler Handler object that is retrieved from MainActivity class and passed to TCPClient
//     *                 class for sending messages and updating UI.
//     */
//    public SendChatMsgTask(Handler mHandler) {
//        this.mHandler = mHandler;
//    }
//
//    /**
//     * Overriden method from AsyncTask class. There the TCPClient object is created.
//     *
//     * @param params From MainActivity class empty string is passed.
//     * @return TCPClient object for closing it in onPostExecute method.
//     */
//    @Override
//    protected TCPClient doInBackground(String... params) {
//        Log.d(TAG, "In do in background");
//
//        try {
//            tcpClient = new TCPClient(mHandler,
//                    COMMAND,
//                    "192.168.1.1",
//                    new MessageCallback() {
//                        @Override
//                        public void callbackMessageReceiver(String message) {
//                            publishProgress(message);
//                        }
//                    });
//
//        } catch (NullPointerException e) {
//            Log.d(TAG, "Caught null pointer exception");
//            e.printStackTrace();
//        }
//        tcpClient.run();
//        return null;
//    }
//
//}
