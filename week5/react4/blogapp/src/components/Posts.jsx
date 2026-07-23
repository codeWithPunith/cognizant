import React, { Component } from "react";
import Post from "./Post";

class Posts extends Component {
  constructor(props) {
    super(props);

    this.state = {
      posts: [],
    };
  }

  loadPosts = async () => {
    try {
      const response = await fetch(
        "https://jsonplaceholder.typicode.com/posts"
      );

      const data = await response.json();

      this.setState({
        posts: data,
      });
    } catch (error) {
      alert(error.message);
    }
  };

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error) {
    alert(error.message);
  }

  render() {
    return (
      <div className="container">
        <h1>Blog Posts</h1>

        {this.state.posts.map((post) => (
          <Post
            key={post.id}
            title={post.title}
            body={post.body}
          />
        ))}
      </div>
    );
  }
}

export default Posts;