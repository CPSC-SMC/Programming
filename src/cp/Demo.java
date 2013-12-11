/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp;

import edu.saintmarys.rottentomatoes.Movie;
import edu.saintmarys.rottentomatoes.MovieListRequest;
import edu.saintmarys.rottentomatoes.MovieSearchRequest;
import edu.saintmarys.rottentomatoes.Review;
import edu.saintmarys.rottentomatoes.ReviewRequest;
import java.awt.Image;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *
 * @author sbroad
 */
public class Demo extends javax.swing.JFrame {

    /**
     * Creates new form Demo
     */
    public Demo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MovieSearchLabel = new javax.swing.JLabel();
        MovieField = new javax.swing.JTextField();
        OKButton = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        MoviesList = new javax.swing.JList();
        MovieTabs = new javax.swing.JTabbedPane();
        PosterLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TweetsArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        ReviewsArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MovieSearchLabel.setText("Movie:");

        MovieField.setToolTipText("");
        MovieField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        jSplitPane1.setBorder(null);
        jSplitPane1.setDividerLocation(300);
        jSplitPane1.setDividerSize(5);

        jScrollPane2.setBorder(null);

        MoviesList.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MoviesList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        MoviesList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                MoviesListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(MoviesList);

        jSplitPane1.setLeftComponent(jScrollPane2);

        MovieTabs.addTab("Poster", PosterLabel);

        TweetsArea.setColumns(20);
        TweetsArea.setRows(5);
        jScrollPane1.setViewportView(TweetsArea);

        MovieTabs.addTab("Tweets", jScrollPane1);

        ReviewsArea.setColumns(20);
        ReviewsArea.setLineWrap(true);
        ReviewsArea.setRows(5);
        ReviewsArea.setWrapStyleWord(true);
        jScrollPane3.setViewportView(ReviewsArea);

        MovieTabs.addTab("Reviews", jScrollPane3);

        jSplitPane1.setRightComponent(MovieTabs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MovieSearchLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MovieField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OKButton))
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MovieSearchLabel)
                    .addComponent(MovieField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OKButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        try {
            // TODO add your handling code here:
            DefaultListModel<Movie> model = new DefaultListModel<Movie>();
            
            MovieSearchRequest req = new MovieSearchRequest(MovieField.getText());
            for (String url : req.getMovieURLs()) {
                model.addElement(new Movie(url));
            }
            
            MoviesList.setModel(model);
        } catch (MovieListRequest.MovieListRequestException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_OKButtonActionPerformed

    private void MoviesListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_MoviesListValueChanged

        // Obtain the movie object
        Movie mov;
        try { 
            mov = (Movie) MoviesList.getSelectedValue(); 
            System.out.println(mov.getApiQuery());
        }
        catch (Exception ex) { 
            PosterLabel.setIcon(null);
            PosterLabel.setText("Movie not found");
            return;
        }
        
        // Display the movie poster
        try {
            // Load the movie poster
            URL url = new URL(mov.getPosterLink());
            ImageIcon img = new ImageIcon(url);
            
            // Rescale the movie poster
            int w = img.getIconWidth();
            int h = img.getIconHeight();
            int labelH = MovieTabs.getHeight() - 36;
            img.setImage(img.getImage().getScaledInstance(labelH*w/h, labelH, Image.SCALE_SMOOTH));
            
            // Put the movie poster into the label, and change the text
            PosterLabel.setIcon(img);
            PosterLabel.setText("");
        } catch (Exception ex) {
            // If for some reason the poster isn't available, indicate this
            PosterLabel.setIcon(null);
            PosterLabel.setText("Poster could not be displayed");
        }
        
        // Display tweets about the movie
        try {
            // clear out the tweets
            TweetsArea.setText("");
            
            // The factory instance is re-useable and thread safe.
            Twitter twitter = TwitterFactory.getSingleton();
            Query query = new Query(mov.getTitle());
            QueryResult result = twitter.search(query);
            String tweet;
            for (Status status : result.getTweets()) {
                tweet = String.format("[%s] @%s tweeted %s\n", 
                        status.getCreatedAt(),
                        status.getUser().getScreenName(),
                        status.getText()
                        );
                TweetsArea.append(tweet);
            }        
        }
        catch (TwitterException ex) {
            TweetsArea.setText(ex.toString());
        }
        
        
        // Display reviews of the movie
        try {
            ReviewsArea.setText("");
            for (Review rev : (new ReviewRequest(mov.getMovie())).getReviews()) {
                String review = String.format("[%s] (by %s, %s)\n%s\n%s\n\n", 
                        rev.getDateOfReview(),
                        rev.getCritic(),
                        rev.getPublication(),
                        rev.getQuote(),
                        rev.getReviewLinkUrl()
                );
                ReviewsArea.append(review);
            }
        } catch (IOException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ReviewRequest.ReviewRequestException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_MoviesListValueChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Demo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MovieField;
    private javax.swing.JLabel MovieSearchLabel;
    private javax.swing.JTabbedPane MovieTabs;
    private javax.swing.JList MoviesList;
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel PosterLabel;
    private javax.swing.JTextArea ReviewsArea;
    private javax.swing.JTextArea TweetsArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
